package com.example.crud.main.serviceinterface;

import java.util.List;

import com.example.crud.main.model.Student;

public interface StudentInterface {
	// To save new student
	public Student saveStudent(Student student);
	
	// To update student
	public Student updateStudent(Student student);
	
	// To fetch all students from database
	public List<Student> findAllStudents();
	
	// To delete student
	public void deleteStudent(int id);

}
