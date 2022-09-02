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

import com.capgemini.Model.TransactionModel;
import com.capgemini.Service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService transactionservice;

	@PostMapping(value = "/addtransaction", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionModel> addTransaction(@RequestBody TransactionModel transactionmodel){
		return ResponseEntity.ok(transactionservice.addTransaction(transactionmodel));
	}
	
	@GetMapping(value = "/getalltransactions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TransactionModel>> getAllTransactions(){
		return ResponseEntity.ok(transactionservice.getAllTransaction());
	}
	
	@GetMapping(value = "/gettransactionbyid/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionModel> getTransactionById(@PathVariable("id") long id){
		return ResponseEntity.ok(transactionservice.getTransactionById(id));
	}
	
	@PutMapping(value = "/updatetransaction/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionModel> updateTransaction(@PathVariable("id") long id, @RequestBody TransactionModel transactionmodel){
		return ResponseEntity.ok(transactionservice.updateTransaction(id, transactionmodel));
	}
	
	@DeleteMapping(value = "/deletetransaction/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteTrasaction(@PathVariable("id") long id){
		return ResponseEntity.ok(transactionservice.removeTransaction(id));
	}
	
}
