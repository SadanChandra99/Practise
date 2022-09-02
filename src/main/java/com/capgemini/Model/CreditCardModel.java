package com.capgemini.Model;

import java.time.LocalDate;

public class CreditCardModel {
	
	private long id;
	private String cardName;
	private String cardNumber;
	private String cardType;
	private String bankName;
	private LocalDate expiryDate;
	
	
	public CreditCardModel(long id, String cardName, String cardNumber, String cardType, String bankName,
			LocalDate expiryDate) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.bankName = bankName;
		this.expiryDate = expiryDate;
	}
	
	
	public CreditCardModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCardModel [id=" + id + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", cardType="
				+ cardType + ", bankName=" + bankName + ", expiryDate=" + expiryDate + "]";
	}
	
	
	

}
