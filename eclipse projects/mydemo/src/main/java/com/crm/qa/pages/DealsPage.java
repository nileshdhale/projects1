package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	
@FindBy(xpath="//input[@id='title']")
WebElement txt_title;

@FindBy(xpath="//select[@id='product_id']")
WebElement txt_product;
@FindBy(xpath="//tbody/tr[3]/td[2]/select[1]")
WebElement txt_type;

@FindBy(xpath="/html/body/div[15]/table/tbody/tr[3]/td[5]")
WebElement txt_date;
@FindBy(xpath="//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
WebElement txt_save;
@FindBy(xpath="//input[@name='client_lookup']")
WebElement txt_company;

@FindBy(xpath="//input[@name='contact_lookup']")
WebElement txt_contact;
@FindBy(xpath="//img[@id='f_trigger_c_close_date']")
WebElement clickdatepicker;
public DealsPage() {
	
	PageFactory.initElements(driver,this);
}


public void editDealsForm(String title, String company , String contact,String type1,String type2) throws InterruptedException {
	txt_title.sendKeys(title);
	txt_company.sendKeys(company);
	txt_contact.sendKeys(contact);
	Select select = new Select(txt_product);
	select.selectByVisibleText(type1);
	Select select1 = new Select(txt_type);
	select1.selectByVisibleText(type2);
	clickdatepicker.click();
	Thread.sleep(2000);
	
	txt_date.click();
	txt_save.click();
	
	
	
}   










}