package com.crm.qa.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;



public class HomePageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	TestUtil testutil;
	
	public HomePageTest() {
		super();
	}@BeforeMethod
	public void setup() {
		initlization();
		homepage = new HomePage();
         loginpage= new LoginPage();
          testutil = new TestUtil();
         
	homepage= loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	
	
	} @Test(priority=1)
	public void clickonContactsTest() {
		testutil.switchToframe();
		homepage.clickonContactLink();
	
	String titlep=homepage.validatePageTitle();
	Assert.assertEquals(titlep, "CRMPRO");
		
	}@Test(enabled=false)
	public void verifyuserNamePresentTest() {
		testutil.switchToframe();
		boolean flag =homepage.checkusername();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	
	

}
