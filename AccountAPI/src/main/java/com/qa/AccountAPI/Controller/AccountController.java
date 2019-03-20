package com.qa.AccountAPI.Controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Service.AccountService;

@RestController
public class AccountController {

	private AccountService svc;

	public AccountController(AccountService svc) {
		this.svc = svc;
	}

	@PostMapping("/createAccount")
	public void createAccount(Account account) {
		svc.createAccount(account);

	}

//	@Autowired
//	RestTemplate restTemplate;

	private RestTemplate rest;

	public RestTemplate getRestTemplate() {
		return rest;
	}

	public AccountController(RestTemplate rest) {
		this.rest = rest;
	}

	@GetMapping(value = "/getAccNum")
	public String getAccNum() {

		return rest.exchange("http://localhost:8081/getAccNum", HttpMethod.GET, null, String.class).getBody();

	}

	@PostMapping(value = "/checkPrize/{accountNumber}")
	public String createAccount(@PathVariable("accountNumber") String accountNumber) {
		return rest.exchange("http://localhost:8082/checkPrize/" + accountNumber, HttpMethod.POST, null, String.class)
				.getBody();

	}
}
