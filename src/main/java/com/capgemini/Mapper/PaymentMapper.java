package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.PaymentEntity;
import com.capgemini.Model.PaymentModel;

@Component
public class PaymentMapper {

	
	public PaymentEntity MapModelToEntity(PaymentModel paymentmodel) {
	
		PaymentEntity paymententity = new PaymentEntity();
		paymententity.setPaymentId(paymentmodel.getPaymentId());
		paymententity.setMethod(paymentmodel.getMethod());
		paymententity.setAmountDue(paymentmodel.getAmountDue());
		return paymententity;
		
	}
	
	public PaymentModel MapEntityToModel(PaymentEntity paymententity) {
		PaymentModel paymentmodel = new PaymentModel();
		BeanUtils.copyProperties(paymententity, paymentmodel);
		return paymentmodel;
	}
	
}
