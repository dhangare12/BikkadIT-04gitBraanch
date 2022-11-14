package com.BikkadIT.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeColtroller {

	public String welcome() {
		String m="welcome to home";
		System.out.println("hello all");
		return m;
		
	}
}
