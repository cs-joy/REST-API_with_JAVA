package com.example.crud.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.main.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
