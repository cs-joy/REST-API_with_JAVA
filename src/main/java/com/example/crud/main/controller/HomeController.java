package com.example.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.main.model.Student;
import com.example.crud.main.serviceimplementation.StudentServiceImpl;

@RestController
// we are suing postman to check operation of our API so that we should need add cross origin annotation
@CrossOrigin("*")
public class HomeController {
	// To create bean of implementation class
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	// To call save method or save new student
	@PostMapping(value = "saveStudent")
	private Student saveStudent(@RequestBody Student student) {
		System.out.println("Student save works properly");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	@GetMapping(value = "getAllStudents")
	public List<Student> findAllStudent(){
		System.out.println("info showed successfully!");
		return studentServiceImpl.findAllStudents();
	}
	
	@PutMapping(value="updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		System.out.println("Updated successfully!");
		return studentServiceImpl.updateStudent(student);
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student deleted successfully!>" + id;
	}

}
