package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.TransactionEntity;
import com.capgemini.Model.TransactionModel;

@Component
public class TransactionMapper {
	
	public TransactionEntity MapModelToEntity(TransactionModel transactionmodel) {
		TransactionEntity transactionentity = new TransactionEntity();
		transactionentity.setTranId(transactionmodel.getTranId());
		transactionentity.setTranDate(transactionmodel.getTranDate());
		transactionentity.setPaymentMethod(transactionmodel.getPaymentMethod());
		transactionentity.setAmount(transactionmodel.getAmount());
		transactionentity.setCardNumber(transactionmodel.getCardNumber());
		transactionentity.setStatus(transactionmodel.getStatus());
		transactionentity.setDescription(transactionmodel.getDescription());
		return transactionentity;
	}
	
	public TransactionModel MapEntityToModel(TransactionEntity transactionentity) {
		TransactionModel transactionmodel = new TransactionModel();
		BeanUtils.copyProperties(transactionentity, transactionmodel);
		return transactionmodel;
	}

}
