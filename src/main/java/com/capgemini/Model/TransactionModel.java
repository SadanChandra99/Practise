package com.capgemini.Model;

import java.time.LocalDate;

public class TransactionModel {

	private long tranId;
	private String cardNumber;
	private LocalDate tranDate;
	private String status;
	private double amount;
	private String paymentMethod;
	private String description;
	public TransactionModel(long tranId, String cardNumber, LocalDate tranDate, String status, double amount,
			String paymentMethod, String description) {
		super();
		this.tranId = tranId;
		this.cardNumber = cardNumber;
		this.tranDate = tranDate;
		this.status = status;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.description = description;
	}
	public TransactionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getTranId() {
		return tranId;
	}
	public void setTranId(long tranId) {
		this.tranId = tranId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getTranDate() {
		return tranDate;
	}
	public void setTranDate(LocalDate tranDate) {
		this.tranDate = tranDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TransactionModel [tranId=" + tranId + ", cardNumber=" + cardNumber + ", tranDate=" + tranDate
				+ ", status=" + status + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", description="
				+ description + "]";
	}
	
	
}
