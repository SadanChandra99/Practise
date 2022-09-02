package com.capgemini.Entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import com.capgemini.Model.AddressModel;

@Entity
@Table
@EntityScan
@Component
public class CustomerEntity {
	
	@Id
	@Column
	private String userId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String contactNo;
	@Column
	private LocalDate dob;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid", referencedColumnName = "pincode")
	private AddressEntity address;
	public CustomerEntity(String userId, String name, String email, String contactNo, LocalDate dob,
			AddressEntity address) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
		this.address = address;
	}
	public CustomerEntity() {
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
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	
	
	

}
