package com.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.StudentService;

@RequestMapping("/student-api")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

}
