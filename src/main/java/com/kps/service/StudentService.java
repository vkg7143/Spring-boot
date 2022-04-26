package com.kps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kps.model.Student;
import com.kps.repository.StudentRepository;

@Service

public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> students=(List<Student>) studentRepository.findAll();
		return students;
	}
	public Optional<Student> getStudent(int rollnumber) {
		return studentRepository.findById(rollnumber);
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	public void updateStudent(Student s, Integer rollNumber) {
		if(rollNumber==s.getRollNumber()) {
			studentRepository.save(s);
		}
	}
	public void deleteAllStudents() {
		studentRepository.deleteAll();
	}

}
