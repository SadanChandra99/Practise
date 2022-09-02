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

import com.capgemini.Model.AccountModel;
import com.capgemini.Service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountservice;
	
	
	
	@PostMapping(value = "/addaccount", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountModel> addAccount(@RequestBody AccountModel accountmodel){
		return ResponseEntity.ok(accountservice.addAccount(accountmodel));
	}
	
	@GetMapping(value = "/getallaccounts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<AccountModel>> getAllAccounts(){
		return ResponseEntity.ok(accountservice.getAllAccounts());
	}
	
	@GetMapping(value = "getaccountbyid/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountModel> getAccountById(@PathVariable("id") long id){
		return ResponseEntity.ok(accountservice.getAccountById(id));
	}
	
	@PutMapping(value = "/updateaccount/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountModel> updateAccount( @PathVariable("id") long id, @RequestBody AccountModel accountmodel){
		return ResponseEntity.ok(accountservice.updateAccount(id, accountmodel));
	}
	
	@DeleteMapping(value = "/deleteaccount/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteAccount(@PathVariable("id") long id){
		return ResponseEntity.ok(accountservice.removeAccount(id));
	}
	
}
