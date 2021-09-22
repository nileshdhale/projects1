package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//input[@value=\"52823772\"]//parent::td")
	WebElement txt_clickoncheckbox;
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement txt_verifycontact;
	@FindBy(xpath="//select[@name='title']")
	WebElement drpselecttxt;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='surname']")
	WebElement lastname ;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement company ;
	@FindBy(xpath="//input[@value='Save']")
	WebElement clicksave ;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}

	public boolean verifycontactsLabel() {
		
		return txt_verifycontact.isDisplayed();
	}
	 public void clickoncheckbox() {
		 txt_clickoncheckbox.click();
	 }
	 public void createNewContact(String title,String ftname,String ltname,String cmpny) {
		 Select select = new Select(drpselecttxt);
		 select.selectByVisibleText(title);
	 	 firstname.sendKeys(ftname);
	 	 lastname.sendKeys(ltname);
	 	 company.sendKeys(cmpny);
	 	 clicksave.click();
	 	 
	 	 
		
	 }

}
