package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase  {
	@FindBy(xpath="//input[@id='company_name']")
	WebElement txt_newCompany;
	@FindBy(xpath="//input[@id='phone']")
	WebElement txt_phoneno;
	@FindBy(xpath="//select[@name='status']")               //     
	WebElement txt_statusdrop;
	@FindBy(xpath="//select[@name='priority']")
	WebElement txt_prioritydrp;
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	@FindBy(xpath="//input[@value='Save' and @type='submit']//parent::td//preceding-sibling::input")
	WebElement txt_save;
	@FindBy(xpath="//a[normalize-space()='Companies']")
	WebElement txt_clickCompanylink;
	@FindBy(xpath="//a[@_name='Infosys']")
	WebElement txt_checknameavailable;
	
	
	public CompaniesPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void EditCompanyPage(String company,String status,String priority,String emailid) {
		Select select =new Select(txt_statusdrop);
		select.selectByVisibleText(status);
		txt_newCompany.sendKeys(company);
		Select select1=new Select(txt_prioritydrp);
		select1.selectByVisibleText(priority);
		txt_Email.sendKeys(emailid);
		txt_save.click();
		
		
		
	}
	public boolean checkcompanyname() {
		
		 return txt_checknameavailable.isDisplayed();
	}
	public void clickoncompaniestab() {
		txt_clickCompanylink.click();
		
	}
	
	
	
	
	
	
	
	
	

}
