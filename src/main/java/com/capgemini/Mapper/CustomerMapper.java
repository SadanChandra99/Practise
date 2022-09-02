package com.capgemini.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.CustomerEntity;
import com.capgemini.Model.CustomerModel;
@Component
public class CustomerMapper {

	@Autowired
	private AddressMapper addressMapper;

	public CustomerEntity MapModelToEntity(CustomerModel customermodel) {
		
		CustomerEntity customerentity = new CustomerEntity();
		customerentity.setUserId(customermodel.getUserId());
		
		customerentity.setName(customermodel.getName());
		customerentity.setEmail(customermodel.getEmail());
		customerentity.setContactNo(customermodel.getContactNo());
		customerentity.setDob(customermodel.getDob());
		System.out.println("dob is :"+customermodel.getDob());
		System.out.println("address mapper class  before set address");
		customerentity.setAddress(addressMapper.MapModelToEntity(customermodel.getAddressmodel()));
		System.out.println("address was :"+ customermodel.getAddressmodel());
		System.out.println("address mapper class  after set address");
		 return customerentity;
		
	}
	
	public CustomerModel MapEntityToModel(CustomerEntity customerentity) {
		CustomerModel customermodel = new CustomerModel();
		customermodel.setUserId(customerentity.getUserId());
		customermodel.setName(customerentity.getName());
		customermodel.setEmail(customerentity.getEmail());
		customermodel.setContactNo(customerentity.getContactNo());
		customermodel.setAddressmodel(addressMapper.MapEntityToModel(customerentity.getAddress()));
		return customermodel;
		
	}
	
}

