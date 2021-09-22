package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CasePage;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CasePageTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	 CasePage casepage;
	CompaniesPage companypage;
	TestUtil testutil;
	String sheetName="casepage";
	
	@BeforeMethod
	public void setup() {
		initlization();
		 casepage= new CasePage();
		 loginpage= new LoginPage();
		 homepage= new HomePage();
		 companypage= new CompaniesPage();
		 testutil = new TestUtil();
		 homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		 testutil.switchToframe();
		 homepage.clickoncase();	
	}
	@Test(dataProvider="getCRMTestData")
	public void testcase(String title,String status,String type,String contact) {
		casepage.editcaseinfo(title, status, type, contact);	
		
	}@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	@AfterMethod
	public void teardown() {
		
		
	}

}
