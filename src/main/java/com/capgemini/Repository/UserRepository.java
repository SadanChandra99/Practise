package com.capgemini.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.UserEntity;
import com.capgemini.Model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	public UserEntity save(UserEntity userentity);
	
	public UserEntity findByUserId(String userid);

}
