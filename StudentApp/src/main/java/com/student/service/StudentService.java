package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;


@Service
public interface StudentService {
	
	Student addStudent(Student student);

    Student deleteStudent(int stid) throws StudentNotFoundException; 

    Student getStudentsById(Integer stid) throws StudentNotFoundException;

    List<Student> getStudentsByCity(String city) throws StudentNotFoundException;
    List<Student> getStudentsByDept(String dept) throws StudentNotFoundException;
    List<Student> findByAge(Integer age) throws StudentNotFoundException;




}
