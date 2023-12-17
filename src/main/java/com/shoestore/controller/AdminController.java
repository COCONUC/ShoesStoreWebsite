package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoestore.entity.User;
import com.shoestore.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	public UserRepository userRepository;

	public AdminController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/")
	public User adminGetUserById() {
		return userRepository.findUserById(2);
	}

	@GetMapping("/all")
	public List<User> adminGetAllUser() {
		return userRepository.findAll();
	}

}
