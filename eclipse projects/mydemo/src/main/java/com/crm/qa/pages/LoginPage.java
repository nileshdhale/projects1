package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")   //Username
	WebElement txt_password;
	
	@FindBy(xpath="//img[@class='img-responsive']//parent::a[@class='navbar-brand']")
	WebElement txt_Logocrm;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement txt_login;
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String validatePageTitle() {
	return	driver.getTitle();
		
	}
	public boolean validateCRMImage() {
		return txt_Logocrm.isDisplayed();
		
	}
	public HomePage Login(String username,String password) {
		txt_username.clear();
		txt_username.sendKeys(username);
		txt_password.clear();
		txt_password.sendKeys(password);
		txt_login.click();
		
		return new  HomePage();
		
		
	}
	
	

}
