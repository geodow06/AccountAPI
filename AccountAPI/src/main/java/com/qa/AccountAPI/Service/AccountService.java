package com.qa.AccountAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repo;

	

	public Account createAccount(Account account) {
		repo.save(account);
		
		return account;
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

	public boolean deleteAccount(Long id) {
		repo.deleteById(id);
		return repo.existsById(id);
	}
}
