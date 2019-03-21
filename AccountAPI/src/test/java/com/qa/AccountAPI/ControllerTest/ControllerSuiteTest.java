package com.qa.AccountAPI.ControllerTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.qa.AccountAPI.Entities.*;
import com.qa.AccountAPI.Controller.AccountController;
import org.springframework.web.client.RestTemplate;
import com.qa.AccountAPI.Service.AccountService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ControllerSuiteTest {
	private static final Account MOCK_OBJECT = new Account("testname", "testname");
	private static final List<Account> MOCK_LIST = new ArrayList<>();
	private static final Long LONG = 1L;
	private static final String STRING = "test";

	@InjectMocks
	AccountController con;

	@Mock
	AccountService svc;

	@Mock
	Account Account;

	@Mock
	RestTemplate rest;

	@Test
	public void testCreateAccount() {
		Mockito.when(svc.createAccount(MOCK_OBJECT)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, con.createAccount(MOCK_OBJECT));
	}

	@Test
	public void testGetAllAccounts() {
		Mockito.when(svc.getAllAccounts()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, con.getAllAccounts());
	}

	@Test
	public void testGetAnAccount() {
		Mockito.when(svc.getAccount(LONG)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, con.getAccount(LONG));
	}

	@Test
	public void testDeleteAccount() {
		Mockito.when(svc.deleteAccount(LONG)).thenReturn(true);
		assertEquals(true, con.deleteAccount(LONG));
	}

	@Test
	public void testUpdateAccount() {
		Mockito.when(svc.updateAccount(MOCK_OBJECT, LONG)).thenReturn(STRING);
		assertEquals("Account testname updated", con.updateAccount(LONG, MOCK_OBJECT));
	}

	@Test
	public void testCheckPrize() {
		Mockito.when(rest.exchange(STRING, HttpMethod.POST, null, String.class).getBody()).thenReturn(STRING);
		assertEquals(STRING, con.checkPrize(STRING));
	}

	@Test
	public void testGetAccNum() {
		ResponseEntity<String> response = null;
		Mockito.when(rest.exchange(STRING, HttpMethod.GET, null, String.class)).thenReturn(response);

		assertEquals(STRING, con.getAccNum());
	}

	@After
	public void tearDown() {

	}

}
