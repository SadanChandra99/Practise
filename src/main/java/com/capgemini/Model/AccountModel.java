package com.capgemini.Model;

public class AccountModel {
	
	private long accountId;
	
	private String accountName;
	
	private double balance;
	
	private String accountType;

	public AccountModel(long accountId, String accountName, double balance, String accountType) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
	}

	public AccountModel() {
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

	@Override
	public String toString() {
		return "AccountModel [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}
	
	

}
