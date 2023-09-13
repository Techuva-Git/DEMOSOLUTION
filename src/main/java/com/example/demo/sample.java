package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class sample {
	
	@RequestMapping(value = "/isServerUp", method = RequestMethod.GET)
	public String isServerUp() {
	return "HELLO WORLD";	
	}

}
