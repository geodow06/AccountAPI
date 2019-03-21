package com.qa.AccountAPI.EntitiesTest;

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
import org.springframework.web.client.RestTemplate;

import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Repository.AccountRepository;
import com.qa.AccountAPI.Service.AccountService;

@RunWith(MockitoJUnitRunner.class)
public class EntitiesSuiteTest {
	private static final Account MOCK_OBJECT = new Account("testname", "testname");
	private static final List<Account> MOCK_LIST = new ArrayList<>();
	private static final Long LONG = 1L;
	private static final String FIRST = "firstname"; 
	private static final String LAST = "lastname"; 
	private static final String STRING = "test";

	@InjectMocks
	Account account;

	@Mock
	AccountRepository repo;

	

	@Mock
	RestTemplate rest;

	@Before
	public void setup() {
		System.out.println("running"); 
	
		account = new Account(FIRST, LAST);
	}

	@Test 
	public void testGetFirstname() { 
		assertEquals(FIRST,account.getFirstname());
	} 
	
	@Test 
	public void testSetFirstname() { 
		account.setFirstname(STRING);
		assertEquals(STRING,account.getFirstname());
	}
	
	@Test 
	public void testGetLastname() { 
		assertEquals(LAST,account.getLastname());
	} 
	
	@Test 
	public void testSetLastname() { 
		account.setLastname(STRING);
		assertEquals(STRING,account.getLastname());
	}
	
	@Test 
	public void testGetId() { 
		assertEquals(null,account.getId());
	} 
	
	@Test 
	public void testSetId() { 
		account.setId(LONG);
		assertEquals(LONG,account.getId());
	}
	
	@Test 
	public void testGetAccountNumber() { 
		assertEquals(null ,account.getAccountNumber());
	}  
	
	@Test 
	public void testSetAccountNumber() { 
		account.setAccountNumber(STRING);
		assertEquals(STRING,account.getAccountNumber());
	}
	
	@Test 
	public void testToString() { 
		assertEquals("Account[id=null, firstname=firstname, lastname=lastname, accountNumber=null]",account.toString());
	}
	@After
	public void tearDown() {

	}
}
