package com.capgemini.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PaymentEntity {

	@Id
	@Column
	private long paymentId;
	@Column
	private String method;
	@Column
	private double amountDue;
	public PaymentEntity(long paymentId, String method, double amountDue) {
		super();
		this.paymentId = paymentId;
		this.method = method;
		this.amountDue = amountDue;
	}
	public PaymentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	} 
	
	
	
}
