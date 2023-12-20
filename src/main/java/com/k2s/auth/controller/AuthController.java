package com.k2s.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2s.auth.services.JwtTockenServices;

@RestController
public class AuthController {

	@GetMapping("/auth")
	
	private final JwtTockenServices jwtTockenServices;
	
	String welcome () {
	return "welcome";
	}
}
