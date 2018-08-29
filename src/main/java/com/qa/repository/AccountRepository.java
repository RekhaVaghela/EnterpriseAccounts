package com.qa.repository;

public interface AccountRepository {

	String getAllAccount();

	String createAccount(String account);

	String updateAccount(Long id, String accountToUpdate);

	String deleteAccount(Long id);

}
