package com.qa.AccountAPI.Service;

import java.util.List;

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

	public String createAccount(Account account) {
		repo.save(account); 
		return "Account "+account.getFirstname()+" "+account.getLastname()+" created";
	}

	public Account getAccount(Long id) {
		return repo.findById(id).get();
	}

	public List<Account> getAllAccounts() {
		return repo.findAll();
	}

	public String updateAccount(Account account, Long id) {
		Account anAccount = getAccount(id);
		anAccount.setAccountNumber(account.getAccountNumber());

		return "Account " + id + " updated";
	}

	public void deleteAccount(Long id) {
		repo.deleteById(id);
	}
}
