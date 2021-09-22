package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.libraries.BaseClass;

import lombok.Data;

@Data
public class DashboardPage extends BaseClass{

	 DashboardPage()
    {
		PageFactory.initElements(driver, this);
    }

	@FindBy(xpath="//h3[text()='Contact Information']/following::a[1]")
    private WebElement link_editContactInfo;
	
	@FindBy(xpath="//span[text()='The account information has been saved.']")
    private WebElement text_accountInfoSavedConfirmationMsg;
		
	public AccountInfoPage clickOnEdit() {
		link_editContactInfo.click();
		return new AccountInfoPage();
	}
	
	public Boolean isAccountInfoSavedMessageDisplayed() {
		return text_accountInfoSavedConfirmationMsg.isDisplayed();
	}
}
