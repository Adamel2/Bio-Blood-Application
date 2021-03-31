package com.bio.v1.app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/*
  @created 31/03/2021 - 13:13
  @author  Adham eldda
  @package com.bio.v1.app.data
  @project GreeBash
 */
@Entity
@Table(name = "users")
public class UserEntity {

   @Id
   @Column(name = "id")
   private String id;

   @Column(name = "user_id")
   private String userID;

   @Column(name = "name")
   private String name;

   @Column(name = "address")
   private String address;

   @Column(name = "phone")
   private String phoneNumber;

   @Column(name = "blood_type")
   private String bloodType;

   @Column(name = "smoke")
   private boolean smoke;

   @Column(name = "create_date")
   private Date createDate;

   public UserEntity() { }

   public UserEntity(String id, String name, String address, String phoneNumber, String bloodType, boolean smoke,Date createDate ,String userID) {
      this.id = id;
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.bloodType = bloodType;
      this.smoke = smoke;
      this.createDate = createDate;
      this.userID  =  userID;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
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

   public Date getCreateDate() {
      return createDate;
   }

   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   public String getUserID() {
      return userID;
   }

   public void setUserID(String userID) {
      this.userID = userID;
   }

   @Override
   public String toString() {
      return "UserEntity{" +
        "id='" + id + '\'' +
        ", userID='" + userID + '\'' +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", bloodType=" + bloodType +
        ", smoke=" + smoke +
        ", createDate=" + createDate +
        '}';
   }
}
