package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.AddressModel;

@Service
public interface AddressService {

	public AddressModel addAddress(AddressModel addressmodel);
	
	public AddressModel getAddressById(int id);
	
	public List<AddressModel> getAllAddress();
	
	public AddressModel updateAddress(int id, AddressModel addressmodel);
	
	public String removeAddress(int id);
}
