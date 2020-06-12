package com.userRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistration.dto.UserDTO;
import com.userRegistration.model.User;
import com.userRegistration.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/hiuser")
	public String hiMsg() {
		return "hi user...";
	}
	
	@PostMapping(value="/signUp")
	public ResponseEntity<String> saveUserDetails(@RequestBody User user) {
		userService.createUser(user);
		return new ResponseEntity<>("success",HttpStatus.OK);
	}

	@GetMapping("/getuser")
	public ResponseEntity<String> getUserById(@RequestParam String userId) {
		return new ResponseEntity<>("get user", HttpStatus.OK);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<String> updateUserById(@RequestBody UserDTO userDTO) {
		userService.saveOrUpdateUserById(userDTO);
		return new ResponseEntity<>("successfully added", HttpStatus.OK);
	}
}
