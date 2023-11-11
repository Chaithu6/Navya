package com.student.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.exception.ResourceNotFoundException;
import com.student.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	public static final Logger log = LoggerFactory.getLogger(StudentController.class);

	@GetMapping("/getAll")
	private List<Student> getAll() {
		log.info("Getting all students list");
		return studentService.getAllStudents();
	}

	@PostMapping("/add")
	private Student add( @RequestBody Student student) {
		log.info("Adding students");
		return studentService.addStudent(student);
	}

	@PutMapping("/update")
	private Student update(@RequestBody Student student) throws ResourceNotFoundException {
		log.info("Updating students");
		return studentService.updateStudent(student);
	}

	@DeleteMapping("/delete/{stid}")
	private String delete(@PathVariable int stid) throws ResourceNotFoundException {
		log.info("Deleting students");
		return studentService.deleteStudent(stid);

	}

}
