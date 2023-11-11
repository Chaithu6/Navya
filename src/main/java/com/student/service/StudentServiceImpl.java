package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;
import com.student.repo.StudentRepo;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student addStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) throws ResourceNotFoundException {
		Student e = studentRepo.findById(student.getStid())
				.orElseThrow(() -> new ResourceNotFoundException("Student Not Found with Id :" + student.getStid()));
		studentRepo.delete(e);
		return studentRepo.save(student);

	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepo.findAll();
	}

	@Override
	public String deleteStudent(int stid) throws ResourceNotFoundException {
		Student e = studentRepo.findById(stid)
				.orElseThrow(() -> new ResourceNotFoundException("Student Not Fount with Id :" + stid));
		studentRepo.delete(e);
		return "student with id " + stid + "has deleted";
	}

}