package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.Entity.AccountEntity;
import com.capgemini.Model.AccountModel;

@Component
public class AccountMapper {
	
	public AccountEntity MapModelToEntity(AccountModel accountmodel) {
		AccountEntity accountentity = new AccountEntity();
		accountentity.setAccountId(accountmodel.getAccountId());
		accountentity.setAccountName(accountmodel.getAccountName());
		accountentity.setAccountType(accountmodel.getAccountType());
		accountentity.setBalance(accountmodel.getBalance());
		return accountentity;
	}
	
	public AccountModel MapEntityToModel(AccountEntity accountentity) {
		AccountModel accountmodel = new AccountModel();
		BeanUtils.copyProperties(accountentity, accountmodel);
		return accountmodel;
	}

}
