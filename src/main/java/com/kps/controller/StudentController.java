package com.kps.controller;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kps.model.Student;
import com.kps.service.StudentService;


@RestController

public class StudentController {
	
	//static final Logger logger=LogManager.getLogger(StudentController.class.getName());
	@Autowired
	private StudentService studentService;
	@GetMapping("/home")
	public String getHome() {
		return "Welcome to student management";
	}
	@GetMapping("/")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@GetMapping("/students/{rollnumber}")
	public Optional<Student> getStudent(@PathVariable int rollNumber) {
		return studentService.getStudent(rollNumber);
	}
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	@PutMapping("/students/{rollNumber}")
	public void updateStudent(@RequestBody Student e,@PathVariable int rollNumber) {
		studentService.updateStudent(e, rollNumber);
	}
	@DeleteMapping("/students")
	public void deleteAllStudents() {
		studentService.deleteAllStudents(); 
	}
   
}
