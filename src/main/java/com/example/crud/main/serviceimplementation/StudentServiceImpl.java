package com.example.crud.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.main.dao.StudentRepository;
import com.example.crud.main.model.Student;
import com.example.crud.main.serviceinterface.StudentInterface;

@Service
public class StudentServiceImpl implements StudentInterface {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		// it returns a list so casting is needed
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// To delete student
		studentRepo.deleteById(id);
		
	}

}
