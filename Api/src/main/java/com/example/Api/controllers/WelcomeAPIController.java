package com.example.Api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeAPIController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot new API app development";
	}

}
