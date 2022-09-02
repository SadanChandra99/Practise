package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.CustomerEntity;
import com.capgemini.Mapper.AddressMapper;
import com.capgemini.Mapper.CustomerMapper;
import com.capgemini.Model.CustomerModel;
import com.capgemini.Repository.CustomerRepository;
import com.capgemini.Service.CustomerService;

@Component
public class CustomerServiceImplement implements CustomerService{

	@Autowired
	public CustomerMapper customermapper;
	@Autowired
	public CustomerRepository customerrepository;
	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public CustomerModel addCustomer(CustomerModel customermodel) {
		// TODO Auto-generated method stub
		CustomerEntity customerentity = customerrepository.save(customermapper.MapModelToEntity(customermodel));
		return customermapper.MapEntityToModel(customerentity);
	}
	@Override
	public CustomerModel getCustomerByUserId(String userId) {
		// TODO Auto-generated method stub
		CustomerEntity customerentity = customerrepository.findByuserId(userId);
		
		return customermapper.MapEntityToModel(customerentity);
	}
	@Override
	public CustomerModel updateCustomer(String userId, CustomerModel customermodel) {
		// TODO Auto-generated method stub
		CustomerEntity customerentity = customerrepository.findByuserId(userId);
		customerentity.setName(customermodel.getName());
		customerentity.setEmail(customermodel.getEmail());
		customerentity.setContactNo(customermodel.getContactNo());
		customerentity.setDob(customermodel.getDob());
		customerentity.setAddress(addressMapper.MapModelToEntity(customermodel.getAddressmodel()));
		customerentity = customerrepository.save(customerentity);
		return customermapper.MapEntityToModel(customerentity);
	}
	@Override
	public List<CustomerModel> getAllCustomers() {
		// TODO Auto-generated method stub
		List<CustomerModel> customermodellist =  null;
		List<CustomerEntity> customerentitylist = customerrepository.findAll();
		if(customerentitylist.size()>0) {
			customermodellist = new ArrayList<>();
		}
		for(CustomerEntity customer:customerentitylist) {
			customermodellist.add(customermapper.MapEntityToModel(customer));
		}
		return customermodellist;
	}
	@Override
	public String removeCustomer(String userId) {
		// TODO Auto-generated method stub
		customerrepository.deleteByUserId(userId);
		return "Customer is Deleted";
	}
}
