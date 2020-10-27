package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

	
		// TODO Auto-generated constructor stub
		@GetMapping("/user/show")
		public String showMessage() {
			return "hello";
		}
		@GetMapping("/user/greet")
		public String greet() {
			return "Great day!";
		}
		@GetMapping("/edit")
		public String editProduct() {
			return "Edited";
		}
		@GetMapping("/add")
		public String addProduct() {
			return "Added";
		}
		
	

}
