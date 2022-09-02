package com.capgemini.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.Entity.UserEntity;
import com.capgemini.Model.UserModel;
import com.capgemini.Repository.UserRepository;
import com.capgemini.Service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserEntity userentity;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("/login")
	public String login() {
		
		return "Login";
	}
	
	@RequestMapping(path = "/processform")
	public String Handleform(HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String userpassword = request.getParameter("password");
		System.out.println("user email is :"+ userid);
		System.out.println("user password is :"+ userpassword);
		
		//try
		UserEntity user  = userrepository.findByUserId(userid);
		
		System.out.println("user.getid() is :"+user.getUserId());
		System.out.println("user.getpassword is "+user.getPassword() );
		
		if( user.getPassword().equals(userpassword)) {
			
			return "success";
		}
		else 
		{
			return "redirect";
		}
		//
		
	}
	
	@PostMapping(value = "/adduser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserModel> addUser(@RequestBody UserModel usermodel){
		return ResponseEntity.ok(userservice.addUser(usermodel));
	}

}
