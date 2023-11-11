package com.student.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int stid;
//	@NotNull(message="Student Name Should be contains only alphabets")  
	private String stname;
	private String rollno;
	private int marks;
	private String branchname;

	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "lect_fk")
	private List<Lecturer> lecturer;

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Student(int stid, String stname, String rollno, int marks, String branchname) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.rollno = rollno;
		this.marks = marks;
		this.branchname = branchname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", rollno=" + rollno + ", marks=" + marks
				+ ", branchname=" + branchname + "]";
	}

}