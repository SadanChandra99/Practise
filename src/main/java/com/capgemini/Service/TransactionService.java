package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.TransactionModel;
@Service
public interface TransactionService {

	public TransactionModel addTransaction(TransactionModel transactionmodel);
	
	public TransactionModel getTransactionById(long id);
	
	public List<TransactionModel> getAllTransaction();
	
	public TransactionModel updateTransaction(long id, TransactionModel transactionmodel);
	
	public String removeTransaction(long id);
	
}
