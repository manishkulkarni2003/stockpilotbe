package com.stockpilot.service;

import com.stockpilot.entity.userEntity;
import java.util.*;
public interface userService {
	
	userEntity createUser(userEntity user);
	
	List<userEntity> getAllUsers();
	
	userEntity getUserById(Long id);
	
	
	
}
