package com.shoestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/hello-world")
	public String hello() {
		return "Hello Ciao";
	}

	@GetMapping("/home")
	public String home(){
		return "shopper/index";
	}

}
