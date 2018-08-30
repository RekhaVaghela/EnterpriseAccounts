package com.qa.repository;

import com.qa.model.Account;

public interface AccountInterface {

	String getAllAccount();

	String createAccount(Account account);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);

}
