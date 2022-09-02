package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, String>{
	
	public CustomerEntity save(CustomerEntity customerentity);
	
	public List<CustomerEntity> findAll();
	
	public CustomerEntity findByuserId(String userId);
	
	public String deleteByUserId(String userId);

}
