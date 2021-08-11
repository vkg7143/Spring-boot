package com.kps.repository;

import org.springframework.data.repository.CrudRepository;

import com.kps.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
