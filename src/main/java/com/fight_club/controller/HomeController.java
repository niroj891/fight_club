package com.fight_club.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/admin/home")
	public String adminHome() {
		return "hello";
	}
	
	@GetMapping("/home")
	public String homeControllerHandler() {
		return "This is home controller";
		
	}

}
