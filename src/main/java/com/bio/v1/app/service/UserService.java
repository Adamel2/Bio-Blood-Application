package com.bio.v1.app.service;

import com.bio.v1.app.data.UserEntity;
import com.bio.v1.app.data.UserRepository;
import com.bio.v1.app.model.UserRequestModel;
import com.bio.v1.app.shared.UserDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/*
 @created 31/03/2021 - 13:13
 @author  Adham eldda
 @package com.bio.v1.app.service
 @project GreeBash
*/
@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  public String addBloodUser(UserRequestModel userRequestModel) {

    if (!userRepository.existsByUserID(userRequestModel.getUserID())
        && !getBloodType(userRequestModel.getBloodType()).equals("Not Found")) {

      ModelMapper modelMapper = new ModelMapper();
      modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
      UserDto userDto = modelMapper.map(userRequestModel, UserDto.class);
      userDto.setId(UUID.randomUUID().toString());
      userDto.setBloodType(getBloodType(userRequestModel.getBloodType()));
      userDto.setCreateDate(new Date());
      UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
      userRepository.save(userEntity);

      return "Success add blood";
    } else {
      return "This user is already exists or Blood Type not exists";
    }
  }

  public List<UserEntity> findAllUsers() {
    return userRepository.findAll();
  }

  public List<UserEntity> findAllUsersByBloodType(String bloodType) {
    return userRepository.findAllByBloodType(bloodType);
  }

  public String getBloodType(String bloodType) {
    if (bloodType == "A+") {
      return "A+";
    }
    if (bloodType.equals("A-")) {
      return "A-";
    }
    if (bloodType.equals("B+")) {
      return "B+";
    }
    if (bloodType.equals("B-")) {
      return "B-";
    }
    if (bloodType.equals("O+")) {
      return "O+";
    }
    if (bloodType.equals("O-")) {
      return "O-";
    }
    if (bloodType.equals("AB+")) {
      return "AB+";
    }
    if (bloodType.equals("AB-")) {
      return "AB-";
    }
    return "Not Found";
  }
}
