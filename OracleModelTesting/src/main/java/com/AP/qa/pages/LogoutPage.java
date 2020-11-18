package com.AP.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AP.qa.base.TestBase;

public class LogoutPage extends TestBase{
	@FindBy(xpath = "//a[@class='logout']")
	WebElement signOut;
	
	@FindBy(xpath = "//div[@class='header_user_info']" )
	WebElement signIn;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn_signOut_button(){
		signOut.click();
	}
	
	
	
	
}
