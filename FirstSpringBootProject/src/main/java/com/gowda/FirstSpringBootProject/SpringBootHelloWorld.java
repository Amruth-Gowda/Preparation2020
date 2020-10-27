package com.gowda.FirstSpringBootProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootHelloWorld {
	
	@RequestMapping("/")
	public String displayHello() {
		return "Hello, World!";
	}
}
