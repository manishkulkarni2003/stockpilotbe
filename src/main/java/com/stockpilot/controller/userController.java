package com.stockpilot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockpilot.entity.userEntity;
import com.stockpilot.service.userService;

@RestController
@RequestMapping("/api/users")
public class userController {
	@Autowired
	private userService userObj;
	
	@PostMapping("/create")
	public userEntity createUser(@RequestBody userEntity user) {
		return userObj.createUser(user);
		
	}
	
	@GetMapping("/getall")
	public List<userEntity>getAllUsers(){
		return userObj.getAllUsers();
	}
	@GetMapping("/getUserById/{id}")
	public userEntity findUserById(@PathVariable Long id) {
		return userObj.getUserById(id);
	}
	
	
}
