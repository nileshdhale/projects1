package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DealsPageTest extends TestBase {
	ContactsPage contactspage;
	String sheetName="dealspage";
	HomePage homepage;
	LoginPage loginpage;
	DealsPage dealpage;
	TestUtil testutil;
	public DealsPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initlization();
		 contactspage= new ContactsPage();
		 homepage = new HomePage();
		 loginpage= new LoginPage();
		 testutil = new TestUtil();
		 dealpage=new DealsPage();
		 homepage= loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		testutil.switchToframe();
		 homepage.clickDeal();	
	}
	
	@Test(dataProvider="getCRMTestData")
	public void editDelasPage(String title, String company , String contact,String type1,String type2) throws InterruptedException {
		dealpage.editDealsForm( title,  company , contact, type1,type2);
		Thread.sleep(2000);
				
	}
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
		
	}
	@AfterMethod
	public void Teardown() {
		
		driver.quit();
	}
	

}
