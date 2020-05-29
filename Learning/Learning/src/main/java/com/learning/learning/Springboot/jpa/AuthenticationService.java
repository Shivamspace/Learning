package com.learning.learning.Springboot.jpa;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class AuthenticationService {

	@GetMapping("/auth")
	public User authetication() {

		return new User("You are authenticated", null);
	}

}
