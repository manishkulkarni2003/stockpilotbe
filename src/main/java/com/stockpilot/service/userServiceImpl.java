package com.stockpilot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockpilot.entity.userEntity;
import com.stockpilot.repository.userRepository;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userRepository User;
	
	@Override
	public userEntity createUser(userEntity user) {
		return User.save(user);
	}

	@Override
	public List<userEntity> getAllUsers() {
		return User.findAll();
	}

	@Override
	public userEntity getUserById(Long id) {
		Optional<userEntity> optionalUser = User.findById(id);
		return optionalUser.orElse(null);
	}
}
