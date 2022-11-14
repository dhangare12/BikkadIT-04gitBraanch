package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController1 {
	@GetMapping("/home")
	public String home() {
		String hello="Good Morning ";
    	return hello;
		
}
}