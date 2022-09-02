package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.AddressEntity;
import com.capgemini.Model.AddressModel;

@Component
public class AddressMapper {

	public AddressEntity MapModelToEntity(AddressModel addressmodel) {
		AddressEntity addressentity = new AddressEntity();
		addressentity.setPincode(addressmodel.getPincode());
		addressentity.setDoorNo(addressmodel.getDoorNo());
		addressentity.setStreet(addressmodel.getStreet());
		addressentity.setArea(addressmodel.getArea());
		addressentity.setCity(addressmodel.getCity());
		addressentity.setState(addressmodel.getState());
		
		return addressentity;
		
	}
	
	public AddressModel MapEntityToModel(AddressEntity addressentity) {
		AddressModel addressmodel = new AddressModel();
		BeanUtils.copyProperties(addressentity, addressmodel);
		return addressmodel;
	}
	
	
}
