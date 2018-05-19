package com.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestServices {
	
	@GetMapping("/env")
	public String display(){
		return "This is Jenkins Project!";
	}

}
