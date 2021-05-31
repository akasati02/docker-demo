package com.maxima.spring.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/welcome")
	public String welcomeDocker() {
		return "Welcome to first docker demo application";
	}
}
