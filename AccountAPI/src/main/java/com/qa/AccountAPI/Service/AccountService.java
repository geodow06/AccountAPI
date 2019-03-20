package com.qa.AccountAPI.Service;

import org.springframework.stereotype.Service;

import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Repository.AccountRepository;

@Service
public class AccountService {
	private AccountRepository repo;

	public AccountRepository getAccountRepository() {
		return repo;
	}

	public AccountService(AccountRepository repo) {
		this.repo = repo;
	}

	public void createAccount(Account account) {
		repo.save(account);
	}
}
