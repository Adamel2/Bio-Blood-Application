package com.bio.v1.app.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
  @created 31/03/2021 - 13:49
  @author  Adham eldda
  @package com.bio.v1.app.data
  @project GreeBash
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {

  boolean existsByUserID(String userID);
  List<UserEntity> findAllByBloodType(String bloodType);
}
