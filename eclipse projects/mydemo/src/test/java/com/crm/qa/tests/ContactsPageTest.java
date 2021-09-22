package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	ContactsPage contactspage;
	HomePage homepage;
	LoginPage loginpage;
	TestUtil testutil;
	String sheetName="contacts";
	
	public ContactsPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		
		initlization();
	  contactspage= new ContactsPage();
	  homepage = new HomePage();
	  loginpage= new LoginPage();
	  testutil = new TestUtil();
	  loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	  testutil.switchToframe();
	 //homepage.clickonContactLink();
		
	}@Test
	public void verifycontactsLabelTest() {
		homepage.clickonContactLink();
		//testutil.switchToframe();
		boolean flag= contactspage.verifycontactsLabel();
		Assert.assertTrue(flag);
	}@Test
	public void clickoncheckboxTest() {
		homepage.clickonContactLink();
		contactspage.clickoncheckbox();
	
	}@Test(dataProvider="getCRMTestData")
	public void validateNewContact(String title,String ftname,String ltname,String cmpny) throws InterruptedException {
		homepage.clickonnewContactLink();
	//contactspage.createNewContact()
		Thread.sleep(2000);
		contactspage.createNewContact(title, ftname, ltname, cmpny);
		
	}@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	

}   //createNewContact("Mr.", "amruta", "dhale", "Fiat");
