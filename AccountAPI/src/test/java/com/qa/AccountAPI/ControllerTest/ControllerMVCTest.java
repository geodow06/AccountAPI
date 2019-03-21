package com.qa.AccountAPI.ControllerTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.AccountAPI.Controller.AccountController;
import com.qa.AccountAPI.Entities.Account;
import com.qa.AccountAPI.Service.AccountService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest 
@WebMvcTest(AccountController.class)
@AutoConfigureMockMvc 
public class ControllerMVCTest {
	@Autowired 
	private MockMvc mvc; 
	
	@MockBean 
	private AccountService svc; 
	
	@Test 
	public void getAllTest() { 
		List<Account> MOCK_LIST = new ArrayList<>(); 
		
	}
}
