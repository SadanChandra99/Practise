package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.CreditCardEntity;
import com.capgemini.Model.CreditCardModel;

@Component
public class CreditCardMapper {
	
	public CreditCardEntity MapModelToEntity(CreditCardModel creditcardmodel) {
		CreditCardEntity creditcardentity =  new CreditCardEntity();
		creditcardentity.setId(creditcardmodel.getId());
		creditcardentity.setCardName(creditcardmodel.getCardName());
		creditcardentity.setCardNumber(creditcardmodel.getCardNumber());
		creditcardentity.setCardType(creditcardmodel.getCardType());
		creditcardentity.setBankName(creditcardmodel.getBankName());
		creditcardentity.setExpiryDate(creditcardmodel.getExpiryDate());
		return creditcardentity;
	}

	public CreditCardModel MapEntityToModel(CreditCardEntity creditcardentity) {
		CreditCardModel creditcardmodel = new CreditCardModel();
		BeanUtils.copyProperties(creditcardentity, creditcardmodel);
		return creditcardmodel;
	}
	
}
