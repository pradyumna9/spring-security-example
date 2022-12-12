package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

	@GetMapping("/")
	public String getMessage() {
		return "<h1> Hello Boot</>";
	}
	@GetMapping("/user")
	public String getUserMessage() {
		return "<h1> Hello Boot User</>";
	}
	@GetMapping("/admin")
	public String getAdminMessage() {
		return "<h1> Hello Boot Admin</>";
	}
	
}
