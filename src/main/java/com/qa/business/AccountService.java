package com.qa.business;

import javax.inject.Inject;

import com.qa.json.JSONUtil;
import com.qa.model.Account;
import com.qa.repository.AccountInterface;

public class AccountService {
	
	@Inject	
	private AccountInterface accountInterface;
	
	@Inject
	private JSONUtil util;
	
	public AccountService() {	
		
	}

	public String createAccount(String account) {
		Account newAccount = util.getObjectForJSON(account, Account.class);
		if(newAccount.getAccountNumber().equals("9999")) return "blocked";
		else accountInterface.createAccount(newAccount);
		return "Done";
	}

}
