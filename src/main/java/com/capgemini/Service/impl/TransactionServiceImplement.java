package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.TransactionEntity;
import com.capgemini.Mapper.TransactionMapper;
import com.capgemini.Model.TransactionModel;
import com.capgemini.Repository.TransactionRepository;
import com.capgemini.Service.TransactionService;
@Component
public class TransactionServiceImplement implements TransactionService{

	@Autowired
	private TransactionMapper transactionmapper;
	
	@Autowired
	private TransactionRepository transactionrepository;
	
	@Override
	public TransactionModel addTransaction(TransactionModel transactionmodel) {
		// TODO Auto-generated method stub
		TransactionEntity transactionentity = transactionrepository.save(transactionmapper.MapModelToEntity(transactionmodel));
		
		return transactionmapper.MapEntityToModel(transactionentity);
	}

	@Override
	public TransactionModel getTransactionById(long id) {
		// TODO Auto-generated method stub
		TransactionEntity transactionentity = transactionrepository.findById(id);
		return transactionmapper.MapEntityToModel(transactionentity);
	}

	@Override
	public List<TransactionModel> getAllTransaction() {
		// TODO Auto-generated method stub
		List<TransactionModel> tranmodellist = null;
		List<TransactionEntity> tranentitylist = transactionrepository.findAll();
		if(tranentitylist.size()>0) {
			tranmodellist = new ArrayList<>();
		}
		for(TransactionEntity trans: tranentitylist) {
			tranmodellist.add(transactionmapper.MapEntityToModel(trans));
		}
		return tranmodellist;
	}

	@Override
	public TransactionModel updateTransaction(long id, TransactionModel transactionmodel) {
		// TODO Auto-generated method stub
		TransactionEntity tranentity = transactionrepository.findById(id);
		tranentity.setTranDate(transactionmodel.getTranDate());
		tranentity.setPaymentMethod(transactionmodel.getPaymentMethod());
		tranentity.setCardNumber(transactionmodel.getCardNumber());
		tranentity.setAmount(transactionmodel.getAmount());
		tranentity.setStatus(transactionmodel.getStatus());
		tranentity.setDescription(transactionmodel.getDescription());
		tranentity = transactionrepository.save(tranentity);
		return transactionmapper.MapEntityToModel(tranentity);
	}

	@Override
	public String removeTransaction(long id) {
		// TODO Auto-generated method stub
		transactionrepository.deleteById(id);
		return "Transaction has been Deleted";
	}

}
