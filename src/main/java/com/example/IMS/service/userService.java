package com.example.IMS.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IMS.model.User;
import com.example.IMS.repository.userRepository;

import jakarta.transaction.Transactional;

@Service
public class userService {

	@Autowired
	userRepository userRepository;
	
	
	@Transactional
	public boolean existingUser(String userName,String password) {
		List<User> vendorList = userRepository.findAll();
		User user = null;
		for (User v : vendorList) {
			if (v.getUserName().equalsIgnoreCase(userName) && v.getPassword().equalsIgnoreCase(password)) {
				 user = v;
				return true;
			}
		}
		return false;
	}
	
	
}
