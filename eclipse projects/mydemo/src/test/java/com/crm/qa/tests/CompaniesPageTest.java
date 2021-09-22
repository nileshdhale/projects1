package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CompaniesPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	CompaniesPage companypage;
	TestUtil testutil;
	String sheetName="companypage";
	
	public CompaniesPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initlization();
		 loginpage= new LoginPage();
		 homepage= new HomePage();
		  companypage= new CompaniesPage();
		  testutil = new TestUtil();
		  homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		  testutil.switchToframe();
		  homepage.clickonCompaniesLink();
		  //testutil.switchToframe();
	 } 
	@Test(dataProvider="getCRMTestData")
	public void editnewCompanyPageTest(String company,String status,String priority,String emailid) {
		companypage.EditCompanyPage(company, status, priority, emailid);	
	}
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	@Test
	public void validatecompanynamepresent() {
		companypage.clickoncompaniestab();
		boolean flag=companypage.checkcompanyname();
		Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
	

}
