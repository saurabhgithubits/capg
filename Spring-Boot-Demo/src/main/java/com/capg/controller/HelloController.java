package com.capg.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Student;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/test")
	public Student getDate() {
		
		Student st= new Student();
		
		st.setStid(102);
		st.setStname("Saurabh");
		
		return st;
	}

}
