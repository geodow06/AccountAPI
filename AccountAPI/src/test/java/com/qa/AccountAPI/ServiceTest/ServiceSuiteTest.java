package com.qa.AccountAPI.ServiceTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.qa.AccountAPI.Controller.AccountController;
import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Repository.AccountRepository;
import com.qa.AccountAPI.Service.AccountService;

@RunWith(MockitoJUnitRunner.class)
public class ServiceSuiteTest {
	private static final Account MOCK_OBJECT = new Account("testname", "testname");
	private static final List<Account> MOCK_LIST = new ArrayList<>();
	private static final Long LONG = 1L;
	private static final String STRING = "test";

	@InjectMocks
	AccountService svc;

	@Mock
	AccountRepository repo;

	@Mock
	Account Account;

	@Mock
	RestTemplate rest;

	@Before
	public void setup() {
		System.out.println("running");

	}

	@Test
	public void testGetAccount() {
		Mockito.when(repo.findById(LONG)).thenReturn(Optional.of(MOCK_OBJECT));
		assertEquals(MOCK_OBJECT, svc.getAccount(LONG));

	}

	@Test
	public void testGetAllAccounts() {
		Mockito.when(repo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllAccounts());
	}

	@Test
	public void testDeleteAccount() {
		assertEquals(false, svc.deleteAccount(LONG));
	}

//	@Test 
//	public void testUpdateAccount() { 
//		Mockito.verify(svc.updateAccount(MOCK_OBJECT, LONG));
//	}

	@After
	public void tearDown() {

	}

}
