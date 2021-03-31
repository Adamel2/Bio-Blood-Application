package com.bio.v1.app.model;

/*
  @created 31/03/2021 - 13:36
  @author  Adham eldda
  @package com.bio.v1.app.model
  @project GreeBash
 */
public class UserRequestModel {

  private String userID;
  private String name;
  private String address;
  private String phoneNumber;
  private String bloodType;
  private boolean smoke;

  public UserRequestModel() { }

  public UserRequestModel(String name, String address, String phoneNumber, String bloodType, boolean smoke,String userID) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.bloodType = bloodType;
    this.smoke = smoke;
    this.userID = userID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getBloodType() {
    return bloodType;
  }

  public void setBloodType(String bloodType) {
    this.bloodType = bloodType;
  }

  public boolean isSmoke() {
    return smoke;
  }

  public void setSmoke(boolean smoke) {
    this.smoke = smoke;
  }

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  @Override
  public String toString() {
    return "UserRequestModel{" +
      "userID='" + userID + '\'' +
      ", name='" + name + '\'' +
      ", address='" + address + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      ", bloodType='" + bloodType + '\'' +
      ", smoke=" + smoke +
      '}';
  }
}
