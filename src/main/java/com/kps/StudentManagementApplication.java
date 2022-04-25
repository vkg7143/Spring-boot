package com.kps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kps.controller.StudentController;

@SpringBootApplication
@ComponentScan(basePackages="com.kps.studentmanagement")
@ComponentScan(basePackageClasses=StudentController.class)
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

}
