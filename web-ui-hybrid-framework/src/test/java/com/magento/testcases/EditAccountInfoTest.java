package com.magento.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.magento.libraries.BaseClass;
import com.magento.libraries.ExcelUtils;
import com.magento.libraries.Utilities;
import com.magento.pages.AccountInfoPage;
import com.magento.pages.DashboardPage;
import com.magento.pages.LoginPage;

public class EditAccountInfoTest extends BaseClass{
	String sheetName="Profile";
	
	LoginPage loginPage;
	Utilities util;
	DashboardPage dashboardpage;
	AccountInfoPage accountInfopage;
	
	public EditAccountInfoTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		accountInfopage = new AccountInfoPage();
		loginPage = new LoginPage();	
		util = new Utilities();	
		dashboardpage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		accountInfopage = dashboardpage.clickOnEdit();	
	}
		
	@DataProvider
	public Object[][] getAccountInfoData(){
		Object data[][] = ExcelUtils.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getAccountInfoData")
	public void EditAccountInformation(String firstName, String lastName){	
		accountInfopage.enterFirstName(firstName);
		accountInfopage.enterLastName(lastName);
		accountInfopage.enterCurrentPassword(prop.getProperty("password"));
		accountInfopage.clickOnSaveButton();
		Assert.assertTrue(dashboardpage.isAccountInfoSavedMessageDisplayed(), "Account Info Message is not displayed or Account Info not saved.");;
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
