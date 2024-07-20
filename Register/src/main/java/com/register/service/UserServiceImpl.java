package com.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.entity.User;
import com.register.repo.UserRepo;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

	

}
