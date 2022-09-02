package com.capgemini.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Entity.AddressEntity;
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Integer>{

	@SuppressWarnings("unchecked")
	public AddressEntity save(AddressEntity addressentity);
	
	public AddressEntity findById(int id);
	
	public List<AddressEntity> findAll();
	
	public String deleteById(int id);
}
