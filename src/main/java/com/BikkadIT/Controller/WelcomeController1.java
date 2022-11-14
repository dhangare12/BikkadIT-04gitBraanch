package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController1 {
    @GetMapping("/msg")
	public String msg() {
		String hi="Welcome to BikkadIT ";
    	return hi;
		
	}
}
