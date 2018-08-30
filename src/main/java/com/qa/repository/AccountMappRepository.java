package com.qa.repository;

import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.qa.json.JSONUtil;
import com.qa.model.Account;

@ApplicationScoped
@Alternative
public class AccountMappRepository implements AccountInterface {
	
	private Map<Long,Account> accountMap;
	private Long id;
	
	
	@Inject
	private JSONUtil util;

	@Override
	public String getAllAccount() {
		return util.getJSONForObject(accountMap.values()); 
	}

	@Override
	public String createAccount(Account account) {
		accountMap.put(id, account);
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	public String updateAccount(Long id, String accountToUpdate) {
		Account updatesAccount = util.getObjectForJSON(accountToUpdate, Account.class);
		accountMap.put(id, updatesAccount);
		return "{\"message\": \"account sucessfully updated\"}";
	}

	@Override
	public String deleteAccount(Long id) {
		accountMap.remove(id);
		return "{\"message\": \"account sucessfully deleted\"}";
	}
	
	
	
	

}
