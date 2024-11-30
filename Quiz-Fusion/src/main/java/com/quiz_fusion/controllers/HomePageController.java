package com.quiz_fusion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizFusion/homePage")
public class HomePageController {
	
	@GetMapping
	public String testAPI() {
		return "Application is Running";
	}
}
