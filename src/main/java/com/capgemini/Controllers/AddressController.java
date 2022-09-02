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

import com.capgemini.Model.AddressModel;
import com.capgemini.Service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressservice;
	
	@PostMapping(value = "/addaddress", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AddressModel> addAddress(@RequestBody AddressModel addressmodel){
		return ResponseEntity.ok(addressservice.addAddress(addressmodel));
	}
	
	@GetMapping(value = "/getaddressbyid/{id}",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AddressModel> getAddressById(@PathVariable("id") int id){
		return ResponseEntity.ok(addressservice.getAddressById(id));
	}
	
	@GetMapping(value = "/getalladdress", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AddressModel>> getAllAddress(){
		return ResponseEntity.ok(addressservice.getAllAddress());
	}
	
	@PutMapping(value = "/updateaddress/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AddressModel> updateAddress(@PathVariable int id, @RequestBody AddressModel addressmodel){
		return ResponseEntity.ok(addressservice.updateAddress(id, addressmodel));
	}
	
	@DeleteMapping(value = "/deleteaddress/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteAddress(@PathVariable int id){
		return ResponseEntity.ok(addressservice.removeAddress(id));
	}
	
}
