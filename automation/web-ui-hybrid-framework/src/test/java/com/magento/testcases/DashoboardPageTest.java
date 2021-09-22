package com.magento.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.libraries.BaseClass;
import com.magento.libraries.Utilities;
import com.magento.pages.DashboardPage;
import com.magento.pages.LoginPage;

public class DashoboardPageTest extends BaseClass{
	
	LoginPage loginPage;
	Utilities util;
	DashboardPage dashboardpage;
	
	public DashoboardPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		util = new Utilities();
		
	}
	
	@Test
	public void pageTitleTest() {
		dashboardpage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(false);  //this test case forcefully failed to check failed test info in extent report
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
