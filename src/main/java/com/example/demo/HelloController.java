package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	HelloRepository repository;

	@GetMapping("/")
	public String getHello() {
		
		Map<String, Object> map = repository.findById(1);
		return (String)map.get("name");
	}

}
