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
import com.AP.qa.util.TestUtil;

public class TC004_Single_Products_WithoutLogin_Checkout_4 extends TestBase{

	/*
	
	
	@Parameters("Browser")
	@BeforeClass
	public void Setup(String Browser) throws Throwable {
		initialization(Browser);
		SetUP(this.getClass().getSimpleName(), driver.getTitle());
		 new SelectProductPage();
		
	}
	
	//Select prdouct test
	@Parameters("Product")
	@Test(priority = 1, enabled = true)
	public void BookingTest(String Product) throws Throwable{
		try {
			TestUtil.MoveElement(SelectProductPage.Target);	//Moving object to desired postion 
			
			SelectProductPage.Tshirt.click();
			
			WaitForObject(SelectProductPage.qty, "Check");
			
			SelectProductPage.qty.clear();
			
			SelectProductPage.qty.sendKeys(prop.getProperty("Qty"));	//Can give number of quantity 
			
			TestUtil.SelectQuantity(SelectProductPage.size, "L");	//Select Size -S / M /L
			
			SelectProductPage.cart.click();
			
			WaitForObject(SelectProductPage.checkout, "Click");
			
			}
			catch(Exception e) {
				String Cause = e.toString();
				Reporting("Fail", "Payment Page Validation", "Payment Page should displayed ", "Payment Page is unable to show due to"+Cause.substring(1, 88), "");
				closeBrowser();
			}
	}
	

	//payment & login test
	@Test(priority = 2, enabled = true)
	public void PaymentTest() throws Throwable{
		
		GlobalValue = Genral_Function.getMultiProductValue(SelectProductPage.Price, SelectProductPage.tax);
		
		if(Genral_Function.Argvalidation("CheckOut Price ", GlobalValue,SelectProductPage.TotalPrice.getText().replace("$", ""))==true) {
			SelectProductPage.proceed.click();
				new LoginPage();
				try {
					
					//Checking For User is logged in or not 
				if(driver.getTitle().contains("Login - My Store")) {
					
					LoginPage.user.sendKeys(prop.getProperty("username"));
					LoginPage.password.sendKeys(prop.getProperty("password"));
					LoginPage.signIn.click();
				
					if(LoginPage.Afterloginvalidation()!=null) {
						 Reporting("Pass", "Login Page Validation", "User successfull naviagted to Payment Page with username - "+prop.getProperty("username")+" & password - "+prop.getProperty("password"), "User should be able to  naviagted to homepage with username - "+prop.getProperty("username"),"");	 
					}
					else {
						 Reporting("Fail", "Login Page Validation", "User unsuccessfull naviagted to Payment Page with username - "+prop.getProperty("username")+" & password - "+prop.getProperty("password"), "User should be able to  naviagted to homepage with username - "+prop.getProperty("username"),"");
						 closeBrowser();
					}
				}
				}catch(Exception e) {
					new PaymentPage();
				System.out.println("Alread Logged in");	
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
	}
	


	//Logout test
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
