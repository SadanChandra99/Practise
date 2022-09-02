package com.capgemini.Model;

public class PaymentModel {

	private long paymentId;
	private String method;
	private double amountDue;
	public PaymentModel(long paymentId, String method, double amountDue) {
		super();
		this.paymentId = paymentId;
		this.method = method;
		this.amountDue = amountDue;
	}
	public PaymentModel() {
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
	@Override
	public String toString() {
		return "PaymentModel [paymentId=" + paymentId + ", method=" + method + ", amountDue=" + amountDue + "]";
	}
	
	
}
