package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/home")
	public String home() {
		String hello="Good Morning ";
    	return hello;
		
}
}