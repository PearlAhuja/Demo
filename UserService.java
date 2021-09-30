package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	public void Save(User user)
	{
		repository.save(user);
		System.out.println("User  : "+ user );
	}

}