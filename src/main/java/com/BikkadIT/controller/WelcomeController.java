package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/msg")
	public String msg() {
		String hi="Welcome to BikkadIT ";
    	return hi;
		
	}
}
