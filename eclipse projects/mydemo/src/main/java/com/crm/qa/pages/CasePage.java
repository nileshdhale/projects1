package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CasePage extends TestBase {

	@FindBy(xpath="//input[@id='title']")
	WebElement txt_title;
	@FindBy(xpath="//select[@name='status']")
	WebElement txt_status;
	
	@FindBy(xpath="//select[@name='type']")
	WebElement txt_type;
	@FindBy(xpath="//input[@name='contact_lookup']")
	WebElement txt_contact;
	@FindBy(xpath="//*[@id='caseForm']/table/tbody/tr[1]/td/input")
	WebElement txt_save;
	@FindBy(xpath="//img[@id='f_trigger_c_deadline']")
	WebElement txt_calendr;
	@FindBy(xpath="/html/body/div[8]/table/tbody/tr[1]/td[3]")
	WebElement txt_date;
	public CasePage() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void editcaseinfo(String title,String status,String type,String contact) {
		 txt_title.sendKeys(title);
		 Select select= new Select(txt_status);
		 select.selectByVisibleText(status);
		 Select select1= new Select( txt_type);
		 select1.selectByVisibleText(type);
		 txt_contact.sendKeys(contact);
		 txt_calendr.click();
		// txt_date.click();
		 
		 txt_save.click();
		
		
	}
	

}
