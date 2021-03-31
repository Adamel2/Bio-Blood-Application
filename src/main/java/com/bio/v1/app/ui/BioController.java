package com.bio.v1.app.ui;

import com.bio.v1.app.data.UserEntity;
import com.bio.v1.app.model.UserRequestModel;
import com.bio.v1.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
  @created 31/03/2021 - 13:07
  @author  Adham eldda
  @package com.bio.v1.app.ui
  @project GreeBash
 */
@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class BioController {

  @Autowired
  private UserService userService;

  @GetMapping("/findAllUsers")
  public List<UserEntity> findAllUsers(){
    return userService.findAllUsers();
  }
  @GetMapping("/findAllUsersByBloodType/{bloodType}")
  public List<UserEntity> findAllUsersByBloodType(@PathVariable String bloodType){
    return userService.findAllUsersByBloodType(bloodType);
  }
  @PostMapping("/saveNewUser")
  public String saveNewUser(@RequestBody UserRequestModel userRequestModel){
    return userService.addBloodUser(userRequestModel);
  }
}
