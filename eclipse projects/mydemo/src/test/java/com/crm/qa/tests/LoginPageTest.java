package com.crm.qa.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

        public class LoginPageTest extends TestBase {
	    LoginPage loginpage;
	    String sheetName="logindata";
	    TestUtil testutil;
	
	    public LoginPageTest() {
		 super();
		
	}    @BeforeMethod
	    public void setup() {
		
		 initlization();
		 loginpage= new LoginPage();
		 testutil = new TestUtil();
		// loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	    /* @Test(dataProvider="getCRMTestData")
	     public void login(String username,String password) {
	    	 
	    	 
	    	 loginpage.Login(username, password);
	     }
		  @DataProvider
			public Object[][] getCRMTestData(){
				Object data[][]= TestUtil.getTestData(sheetName);
				return data;
		  } */
	@Test
	public void logintest() {
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	     @AfterMethod
	     public void TearDown() {
		
		 driver.quit();
	}
	
	

    }
