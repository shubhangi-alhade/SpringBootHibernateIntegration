package com.tka.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Classroom {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int clsId;
String clsLocation;
int clsCapacity;
String clsName;
public Classroom() {
	super();
	// TODO Auto-generated constructor stub
}
public Classroom(int clsId, String clsLocation, int clsCapacity, String clsName) {
	super();
	this.clsId = clsId;
	this.clsLocation = clsLocation;
	this.clsCapacity = clsCapacity;
	this.clsName = clsName;
}
public int getClsId() {
	return clsId;
}
public void setClsId(int clsId) {
	this.clsId = clsId;
}
public String getClsLocation() {
	return clsLocation;
}
public void setClsLocation(String clsLocation) {
	this.clsLocation = clsLocation;
}
public int getClsCapacity() {
	return clsCapacity;
}
public void setClsCapacity(int clsCapacity) {
	this.clsCapacity = clsCapacity;
}
public String getClsName() {
	return clsName;
}
public void setClsName(String clsName) {
	this.clsName = clsName;
}
@Override
public String toString() {
	return "Classroom [clsId=" + clsId + ", clsLocation=" + clsLocation + ", clsCapacity=" + clsCapacity + ", clsName="
			+ clsName + "]";
}




}
