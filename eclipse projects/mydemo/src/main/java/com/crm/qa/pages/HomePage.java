package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//a[@title='Contacts']") ////a[@title="Companies"]
	WebElement txt_contacts;
	@FindBy(xpath="//a[normalize-space()='Companies']")
	WebElement txt_companies;
	@FindBy(xpath="//a[@title='Deals']")
	WebElement txt_deals;
	
	@FindBy(xpath="//a[@title='New Company']")
	WebElement txt_newCompany;
	@FindBy(xpath="//td[@class='headertext' and contains(text(),'group automation')]")
	WebElement txt_usernamepresent;
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement txt_contactLink;
	@FindBy(xpath="//a[@title='Deals']")
	WebElement txt_Deal;
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement txt_newDeal;
	@FindBy(xpath="//a[contains(text(),'Cases')]")
	WebElement txt_case;
	@FindBy(xpath="//a[contains(text(),'New Case')]")
	WebElement txt_newcase;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public ContactsPage clickonContactLink() {
		txt_contacts.click();
	return new ContactsPage();
		
	}
	public String validatePageTitle() {
		return driver.getTitle();
		
	}
	public DealsPage clickonDealslink() {
		 txt_deals.click();
		return new DealsPage();
		
	}
	public boolean checkusername() {
		return txt_usernamepresent.isDisplayed();
		
	}
	public void clickonnewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(txt_contacts).build().perform();
		txt_contactLink.click();
		
	}
	public void clickonCompaniesLink() {
		Actions action = new Actions(driver);
		action.moveToElement(txt_companies).build().perform();
		txt_newCompany.click();
	
	}
	public void clickDeal() {
		Actions action = new Actions(driver);
		action.moveToElement(txt_case).build().perform();
		txt_newDeal.click();
		
		
	}
	public void clickoncase() {
		
		Actions action = new Actions(driver);
		action.moveToElement( txt_case).build().perform();
		txt_newcase.click();
		
	}
	
	
	
	
	
	

}
