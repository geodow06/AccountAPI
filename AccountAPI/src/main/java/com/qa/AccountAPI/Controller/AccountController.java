package com.qa.AccountAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Service.AccountService;

@RestController
public class AccountController {

	private AccountService svc;

	private RestTemplateBuilder rest;

	private JmsTemplate jms;

	public AccountController(AccountService svc, RestTemplateBuilder rest, JmsTemplate jms) {
		this.svc = svc;
		this.rest = rest;
		this.jms = jms;
	}

	@PostMapping(value = "/checkPrize/{accountNumber}")
	public String checkPrize(@PathVariable("accountNumber") String accountNumber) {
		return rest.build()
				.exchange("http://localhost:8082/checkPrize/" + accountNumber, HttpMethod.POST, null, String.class)
				.getBody();

	}

	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) {
		account.setAccountNumber(getAccNum());
		Account acc = svc.createAccount(account);
		jms.convertAndSend("Account", acc);
		return acc;
	}

	@DeleteMapping("/deleteAccount/{id}")
	public boolean deleteAccount(@PathVariable Long id) {
		return svc.deleteAccount(id);
	}

//	@Autowired
//	RestTemplate restTemplate;b 

	@GetMapping(value = "/getAccNum")
	public String getAccNum() {
		return rest.build().exchange("http://localhost:8081/getAccNum", HttpMethod.GET, null, String.class).getBody();
	}

	@GetMapping("/getAccount/{id}")
	public Account getAccount(@PathVariable Long id) {
		return svc.getAccount(id);
	}

	@GetMapping("/getAllAccounts")
	public List<Account> getAllAccounts() {
		return svc.getAllAccounts();
	}

	@PostMapping("/updateAccount/{id}/{account}")
	public String updateAccount(@PathVariable Long id, @PathVariable Account account) {
		svc.updateAccount(account, id);
		return "Account " + account.getFirstname() + " updated";
	}
}
