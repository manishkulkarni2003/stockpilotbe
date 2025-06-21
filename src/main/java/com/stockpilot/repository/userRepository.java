package com.stockpilot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockpilot.entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Long> {

	List<userEntity> findAll();

	
}
