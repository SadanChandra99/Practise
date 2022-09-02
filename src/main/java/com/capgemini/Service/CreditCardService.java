package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.CreditCardModel;

@Service
public interface CreditCardService {
	
	public CreditCardModel addCreditCard(CreditCardModel creditcardmodel);
	
	public CreditCardModel getCreditCardById(long id);
	
	public CreditCardModel updateCreditCard(long id, CreditCardModel creditcardmodel);

	public List<CreditCardModel> getAllCreditCards();
	
	public String removeCreditCard(long id);
}
