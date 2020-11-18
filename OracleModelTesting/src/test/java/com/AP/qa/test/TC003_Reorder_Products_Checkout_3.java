package com.AP.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.AP.qa.base.TestBase;
import com.AP.qa.pages.LoginPage;
import com.AP.qa.pages.LogoutPage;
import com.AP.qa.pages.PaymentPage;
import com.AP.qa.pages.SelectProductPage;
import com.AP.qa.util.Genral_Function;


public class TC003_Reorder_Products_Checkout_3 extends TestBase{
/*
	LoginPage loginPage;

	
	@Parameters("Browser")
	@BeforeClass
	public void init(String Browser) throws Throwable {
		initialization(Browser);
		SetUP(this.getClass().getSimpleName(), driver.getTitle());
		loginPage = new LoginPage();
	}
	
	//Login Test
	@Test
	public void LoginTest() throws Throwable{
		
		LoginPage.signInbtn.click();
		LoginPage.user.sendKeys(prop.getProperty("username"));
		LoginPage.password.sendKeys(prop.getProperty("password"));
		LoginPage.signIn.click();
	
		
		
		if(LoginPage.Beforeloginvalidation()!=null) {
			Reporting("Pass", "Login Page Validation", "User successfull naviagted to homepage with username - "+prop.getProperty("username"), "User should be able to  naviagted to homepage with username - "+prop.getProperty("username"), "");	 
		}
		else {
			Reporting("Fail", "Login Page Validation", "User unsuccessfull naviagted to homepage with username - "+prop.getProperty("username"), "User should be able to  naviagted to homepage with username - "+prop.getProperty("username"), "");
			 closeBrowser();
		}
	}
	
	
	//Select Product Test
	@Parameters("Product")
	@Test(priority = 2,enabled = true)
	public void ReorderTest(String Product) throws Throwable {
		WaitForObject(SelectProductPage.profile, "Click");		
		SelectProductPage.orderDetails.click();
		SelectProductPage.selectFirstOrder.click();
	}
	
	//Payment Test
	@Test(priority = 3,enabled = true)
	public void PaymentTest() throws Throwable{
		GlobalValue = Genral_Function.getMultiProductValue(SelectProductPage.Price, SelectProductPage.tax);
		
		if(Genral_Function.Argvalidation("CheckOut Price ", GlobalValue,SelectProductPage.TotalPrice.getText().replace("$", ""))==true) {
			 new PaymentPage();
			 PaymentPage.proceed.click();
		}
		
		PaymentPage.processAddress.click();
		PaymentPage.checkbox.click();
		PaymentPage.processCarrier.click();
		GlobalValue = PaymentPage.amount.getText().replace("$", "");
		PaymentPage.pay_method.click();
		PaymentPage.confirm.click();
		
		if(Genral_Function.Argvalidation("Final Price Validation", GlobalValue,PaymentPage.price.getText().replace("$", ""))==true) {
				new LogoutPage();
		}
		
	}
	
	//Logout Test
	@Test(priority = 4, enabled = true)
	public void LogoutTest() throws Throwable {
		LogoutPage.signOut.click();
		Genral_Function.logoutvalidation(LogoutPage.signIn.getText());
	}
	
	@AfterClass
	public void Flush() throws Throwable
	{
		closeBrowser();
	}
	*/
}
