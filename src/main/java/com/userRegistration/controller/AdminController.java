package com.userRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistration.model.User;
import com.userRegistration.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/hiadmin")
	public String hiMsg() {
		return "hi admin...";
	}
	@GetMapping("/users")
	public ResponseEntity<List<User>> listAllUsers() {
		return new ResponseEntity<>(adminService.listAllUsers(), HttpStatus.OK);
	}

	@DeleteMapping("/deluser")
	public ResponseEntity<String> deleteUserById(@RequestParam String userId) {
		return new ResponseEntity<>("successfully deleted", HttpStatus.OK);
	}
}
