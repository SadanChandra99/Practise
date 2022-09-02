package com.capgemini.Model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CustomerModel {

	
	private String userId;
	private String name;
	private String email;
	private String contactNo;
	private LocalDate dob;
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid", referencedColumnName = "pincode")
	private AddressModel addressmodel;
	public CustomerModel(String userId, String name, String email, String contactNo, LocalDate dob,
			AddressModel addressmodel) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
		this.addressmodel = addressmodel;
	}
	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public AddressModel getAddressmodel() {
		return addressmodel;
	}
	public void setAddressmodel(AddressModel addressmodel) {
		this.addressmodel = addressmodel;
	}
	@Override
	public String toString() {
		return "CustomerModel [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", addressmodel=" + addressmodel + "]";
	}
	
	
	
	
	
	
	
}
