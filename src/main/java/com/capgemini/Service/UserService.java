package com.capgemini.Service;

import org.springframework.stereotype.Service;

import com.capgemini.Model.UserModel;

@Service
public interface UserService {
	
	public UserModel addUser(UserModel usermodel);

	public UserModel signIn(UserModel usermodel);
	
	public String signOut();
	
	public UserModel changePassword(String userid, UserModel usermodel);
}
