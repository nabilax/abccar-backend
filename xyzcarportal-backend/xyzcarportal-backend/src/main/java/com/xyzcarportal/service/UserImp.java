package com.xyzcarportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzcarportal.entity.User;
import com.xyzcarportal.repo.UserRepo;

@Service("UserService")
public class UserImp implements UserService  {
    @Autowired
    UserRepo ut;
	@Override
	public void AddUser(User cust) {
		// TODO Auto-generated method stub
		ut.save(cust);
		System.out.println("added");
	}

	@Override
	public void DeleteUser(User cust) {
		// TODO Auto-generated method stub
		ut.delete(cust);
		
	}

}
