package com.qa.AccountAPI;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qa.AccountAPI.ControllerTest.ControllerSuiteTest;
import com.qa.AccountAPI.EntitiesTest.EntitiesSuiteTest;
import com.qa.AccountAPI.ServiceTest.ServiceSuiteTest;

@RunWith(Suite.class) 
@SuiteClasses({ServiceSuiteTest.class,EntitiesSuiteTest.class,ControllerSuiteTest.class}) 
public class AccountApiApplicationTests{ 
	
}