package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.UserEntity;
import com.capgemini.Model.UserModel;
@Component
public class UserMapper {

	public UserEntity MapModelToEntity(UserModel usermodel) {
		 UserEntity userentity = new UserEntity();
		 userentity.setUserId(usermodel.getUserId());
		 userentity.setPassword(usermodel.getPassword());
		 return userentity;
	}
	
	public UserModel MapEntityToModel(UserEntity userentity) {
		UserModel usermodel = new UserModel();
		BeanUtils.copyProperties(userentity, usermodel);
		return usermodel;
	}
}
