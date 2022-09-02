package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.CustomerModel;

@Service
public interface CustomerService {

	public CustomerModel addCustomer(CustomerModel customermodel);
	
	public CustomerModel getCustomerByUserId(String userId);
	
	public CustomerModel updateCustomer(String userId,CustomerModel customermodel );
	
	public List<CustomerModel> getAllCustomers();
	
	public String removeCustomer(String userId);
	
}
