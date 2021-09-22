package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage {

	private TvPage(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//a[@href='http://live.demoguru99.com/index.php/tv.html']")
    private WebElement link_tv;
}
