package com.student.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lecturer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lId;
	@JsonProperty("lname")
	private String lName;
	@JsonProperty("subjname")
	private String subjName;
	
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lecturer(int lId, String lName, String subjName) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.subjName = subjName;
	}

	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	@Override
	public String toString() {
		return "Lecturer [lId=" + lId + ", lName=" + lName + ", subjName=" + subjName + "]";
	}
	
	

}