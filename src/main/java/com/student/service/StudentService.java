package com.student.service;

import java.util.List;

import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;

public interface StudentService {
	Student addStudent(Student student);
	Student updateStudent(Student student) throws ResourceNotFoundException;
	List<Student> getAllStudents();
	String deleteStudent(int stid) throws ResourceNotFoundException;
	

}