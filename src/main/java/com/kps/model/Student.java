package com.kps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	@Id
	@Column(name = "rollnumber")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rollNumber;
	@Column(name = "studentname")
	private String studentName;

	/**
	 * @return the rollNumber
	 */
	public Integer getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
