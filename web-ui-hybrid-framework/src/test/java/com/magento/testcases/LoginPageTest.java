package com.magento.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.libraries.BaseClass;
import com.magento.libraries.Utilities;
import com.magento.pages.DashboardPage;
import com.magento.pages.LoginPage;

public class LoginPageTest extends BaseClass{
	LoginPage loginPage;
	Utilities util;
	DashboardPage dashboardpage;
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		util = new Utilities();		
	}
	
	@Test
	public void loginSuccessTest(){
		dashboardpage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(), "My Account", "UNABLE TO LOGIN");
	}
	
	@Test
	public void loginFailureTest(){
		dashboardpage = loginPage.login(prop.getProperty("username"), prop.getProperty("password2"));
		Assert.assertEquals(driver.getTitle(), "My Account", "UNABLE TO LOGIN");
	}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
