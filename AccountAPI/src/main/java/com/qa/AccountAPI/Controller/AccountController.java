package com.qa.AccountAPI.Controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
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

	private RestTemplate rest;

	public AccountController(AccountService svc, RestTemplateBuilder rest) {
		this.svc = svc;
		this.rest = rest.build();
	}

	@PostMapping(value = "/checkPrize/{accountNumber}")
	public String checkPrize(@PathVariable("accountNumber") String accountNumber) {
		return rest.exchange("http://localhost:8082/checkPrize/" + accountNumber, HttpMethod.POST, null, String.class)
				.getBody();

	}

	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) {
		account.setAccountNumber(getAccNum());
		return svc.createAccount(account);
	}

	@DeleteMapping("/deleteAccount/{id}")
	public void deleteAccount(@PathVariable Long id) {
		svc.deleteAccount(id);
	}

//	@Autowired
//	RestTemplate restTemplate;b 

	@GetMapping(value = "/getAccNum")
	public String getAccNum() {
		return rest.exchange("http://localhost:8081/getAccNum", HttpMethod.GET, null, String.class).getBody();
	}

	@GetMapping("/getAccount/{id}")
	public void getAccount(@PathVariable Long id) {
		svc.getAccount(id);
	}

	@GetMapping("/getAllAccounts")
	public void getAllAccounts() {
		svc.getAllAccounts();
	}

	public RestTemplate getRestTemplate() {
		return rest;
	}

	@PostMapping("/updateAccount/{id}/{account}")
	public void updateAccount(@PathVariable Long id, @PathVariable Account account) {
		svc.updateAccount(account, id);
	}
}
