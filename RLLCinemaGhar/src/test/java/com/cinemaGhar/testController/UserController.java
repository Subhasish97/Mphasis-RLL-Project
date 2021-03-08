package com.cinemaGhar.testController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cinemaGhar.controller.AdminRestController;
import com.cinemaGhar.controller.UserRestController;

import static org.junit.Assert.*;


//-----------------------------------------------------------------------------------
//************************JUNIT TESTING MODULE***************************************
//-----------------------------------------------------------------------------------

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/dispserv-servlet.xml" })
public class UserController 
{
	@Autowired
	private UserRestController userRestController;
	
	@Autowired
	private AdminRestController adminRestController;
	
	
	//UNIT-TEST FOR CHECK SUCCESSFUL LOGIN OF USER
	//********************************************
	@Test
	public void userLoginSuccessProcesstest() 
	{
		System.out.println("User Validation to check PASS ");
		
		String expectedloginS="Welcomesipu@gmail.com";
		
		String actualloginS =  userRestController.userValidate("sipu@gmail.com", "Sipu@1997");
		
		assertEquals(expectedloginS, actualloginS);
		
	}
	
	//UNIT-TEST FOR CHECK UNSUCCESSFUL LOGIN OF USER
	//***********************************************
	@Test
	public void userLoginFailProcesstest() 
	{
		System.out.println("User Validation to check FAIL ");
		
		String expectedloginF="Invalid USER";
		
		String actualloginF = userRestController.userValidate("sip@com","1");
		assertEquals(expectedloginF, actualloginF);
		
	}
	
	//UNIT-TEST FOR CHECK SUCCESSFUL LOGIN OF ADMIN
	//*********************************************
	@Test
	public void adminLoginSuccessProcesstest() 
	{
		System.out.println("Admin Validation to check PASS ");
		
		String expectedloginS="Welcomeadmin@gmail.com";
		
		String actualloginS =  adminRestController.adminValidate("admin@gmail.com", "admin");
		
		assertEquals(expectedloginS, actualloginS);
		
	}
	
	//UNIT-TEST FOR CHECK UNSUCCESSFUL LOGIN OF ADMIN
	//***********************************************
	@Test
	public void adminLoginFailProcesstest() 
	{
		System.out.println("Admin Validation to check FAIL");
		
		String expectedloginF="Invalid ADMIN";
		
		String actualloginF = adminRestController.adminValidate("sip@com","1");
		assertEquals(expectedloginF, actualloginF);
		
	}

}
