package com.capgemini.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class UserEntity {

	@Id
	@Column
	private String userId;
	@Column
	private String password;
	
	public UserEntity(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	public UserEntity() {
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
	
	
}
