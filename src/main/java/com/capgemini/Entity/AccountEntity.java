package com.capgemini.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TABLE")
public class AccountEntity {
	@Id
	@Column
	private long accountId;
	@Column
	private String accountName;
	@Column
	private double balance;
	@Column
	private String accountType;
	
	public AccountEntity(long accountId, String accountName, double balance, String accountType) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
	}
	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	

}
