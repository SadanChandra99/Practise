package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.PaymentEntity;
import com.capgemini.Mapper.PaymentMapper;
import com.capgemini.Model.PaymentModel;
import com.capgemini.Repository.PaymentRepository;
import com.capgemini.Service.PaymentService;

@Component
public class PaymentServiceImplement implements PaymentService{
	@Autowired
	private PaymentMapper paymentmapper;
	@Autowired
	private PaymentRepository paymentrepository;

	@Override
	public PaymentModel addPayment(PaymentModel accountmodel) {
		// TODO Auto-generated method stub
		PaymentEntity paymententity = paymentrepository.save(paymentmapper.MapModelToEntity(accountmodel));
		return paymentmapper.MapEntityToModel(paymententity);
	}

	@Override
	public PaymentModel getPaymentById(long id) {
		// TODO Auto-generated method stub
		PaymentEntity paymententity = paymentrepository.findById(id);
		return paymentmapper.MapEntityToModel(paymententity);
	}

	@Override
	public List<PaymentModel> getAllPayments() {
		// TODO Auto-generated method stub
		List<PaymentModel> paymentmodellist = null;
		List<PaymentEntity> paymententitylist = paymentrepository.findAll();
		if(paymententitylist.size()>0) {
			paymentmodellist =new ArrayList<>();
		}
		for(PaymentEntity payment:paymententitylist) {
			paymentmodellist.add(paymentmapper.MapEntityToModel(payment));
		}
		return paymentmodellist;
	}

	@Override
	public PaymentModel updatePayment(long id, PaymentModel paymentmodel) {
		// TODO Auto-generated method stub
		PaymentEntity paymententity = paymentrepository.findById(id);
		paymententity.setMethod(paymentmodel.getMethod());
		paymententity.setAmountDue(paymentmodel.getAmountDue());
		paymententity = paymentrepository.save(paymententity);
		return paymentmapper.MapEntityToModel(paymententity);
	}

	@Override
	public String removePayment(long id) {
		// TODO Auto-generated method stub
		paymentrepository.deleteById(id);
		return "Payment Deleted Succesfully";
	}

}
