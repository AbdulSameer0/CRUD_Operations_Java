package com.springboot.UMS.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class User {
  @Id
  private int userId;
  private String userName;
  private String userAddress;
  private String userRole;
  
  
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getUserRole() {
	return userRole;
}
public void setUserRole(String userRole) {
	this.userRole = userRole;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, String userAddress, String userRole) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userAddress = userAddress;
	this.userRole = userRole;
}
  
  
}
