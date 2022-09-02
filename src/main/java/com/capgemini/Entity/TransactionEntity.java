package com.capgemini.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class TransactionEntity {
	
	@Id
	@Column
	private long tranId;
	@Column
	private String cardNumber;
	@Column
	private LocalDate tranDate;
	@Column
	private String status;
	@Column
	private double amount;
	@Column
	private String paymentMethod;
	@Column
	private String description;
	public TransactionEntity(long tranId, String cardNumber, LocalDate tranDate, String status, double amount,
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
	public TransactionEntity() {
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
	
	
	

}
