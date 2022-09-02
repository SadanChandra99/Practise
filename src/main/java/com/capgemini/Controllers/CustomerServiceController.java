package com.capgemini.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Model.CustomerModel;
import com.capgemini.Service.CustomerService;

@RestController
public class CustomerServiceController {

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping(value = "/addcustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerModel> addCustomer(@RequestBody CustomerModel customermodel){
		return ResponseEntity.ok(customerservice.addCustomer(customermodel));
	}
	
	@GetMapping(value = "/getcustomerbyid/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerModel> getCustomerById(@PathVariable("id") String id){
		return ResponseEntity.ok(customerservice.getCustomerByUserId(id));
	}
	
	@GetMapping(value = "/getallcustomers", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CustomerModel>> getAllCustomers()
	{
		return  ResponseEntity.ok(customerservice.getAllCustomers());
	}
	
	@PutMapping(value = "/updatecustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerModel> updateCustomer(@PathVariable String id,@RequestBody CustomerModel customermodel){
		return ResponseEntity.ok(customerservice.updateCustomer(id, customermodel));
	}
	
	@DeleteMapping(value = "/deletecustomer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> removeCustomer(String id){
		return ResponseEntity.ok(customerservice.removeCustomer(id));
	}
	
}
