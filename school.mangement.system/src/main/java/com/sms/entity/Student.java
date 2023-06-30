package com.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school_std")
public class Student {
   @Id
   private int id;
   private String name;
   private String subject;
   private String address;
   private long rollNo;
   
public Student() {
	
}
public Student(int id, String name, String subject, String address, long rollNo) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
	this.address = address;
	this.rollNo = rollNo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getRollNo() {
	return rollNo;
}
public void setRollNo(long rollNo) {
	this.rollNo = rollNo;
}
   
   
}
