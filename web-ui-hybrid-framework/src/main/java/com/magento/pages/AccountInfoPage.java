package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.libraries.BaseClass;

public class AccountInfoPage extends BaseClass {

	public AccountInfoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstname")
	private WebElement txt_firstName;

	@FindBy(id = "lastname")
	private WebElement txt_lastName;

	@FindBy(xpath = "//button[@title='Save']")
	private WebElement btn_save;
	
	@FindBy(id = "current_password")
	private WebElement txtbox_currentPassword;

	public DashboardPage enterFirstName(String firstname) {
		txt_firstName.clear();
		txt_firstName.sendKeys(firstname);
		return new DashboardPage();
	}

	public void enterLastName(String lastname) {
		txt_lastName.clear();
		txt_lastName.sendKeys(lastname);
	}

	public void clickOnSaveButton() {
		btn_save.click();
	}
	
	public void enterCurrentPassword(String password) {
		txtbox_currentPassword.sendKeys(password);
	}

	public WebElement getTxt_firstName() {
		return txt_firstName;
	}

	public void setTxt_firstName(WebElement txt_firstName) {
		this.txt_firstName = txt_firstName;
	}

}
