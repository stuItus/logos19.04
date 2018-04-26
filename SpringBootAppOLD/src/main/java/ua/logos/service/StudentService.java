package ua.logos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.logos.entity.Student;

@Service
public interface StudentService {

	void saveStudent(Student student);
	
	Student findById(int id);
	
	List<Student> findAllStudents();
}
