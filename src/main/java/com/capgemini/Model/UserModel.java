package com.capgemini.Model;

public class UserModel {
	
	private String userId;
	private String password;
	public UserModel(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", password=" + password + "]";
	}
	
	

}
