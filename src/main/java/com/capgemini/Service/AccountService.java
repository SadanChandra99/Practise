package com.capgemini.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.Model.AccountModel;

@Service
public interface AccountService {
	
	public AccountModel addAccount(AccountModel accountmodel);
	
	public AccountModel getAccountById(long id);
	
	public List<AccountModel> getAllAccounts();
	
	public AccountModel updateAccount(long id, AccountModel accountmodel);
	
	public String removeAccount(long id);

}
