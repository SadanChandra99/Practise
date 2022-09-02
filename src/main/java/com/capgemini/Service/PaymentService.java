package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.PaymentModel;
@Service
public interface PaymentService {

	public PaymentModel addPayment(PaymentModel accountmodel);
	
	public PaymentModel getPaymentById(long id);
	
	public List<PaymentModel> getAllPayments();
	
	public PaymentModel updatePayment(long id, PaymentModel accountmodel);
	
	public String removePayment(long id);
	
}
