package com.insurance.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.auto.model.personaldetails.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
