package com.AP.qa.test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.AP.qa.base.TestBase;
import com.AP.qa.util.*;
import com.AP.qa.util.Genral_Function;
import com.AP.qa.util.TestUtil;



public class TC001_Single_Product_Checkout extends TestBase {
	
	OracleFunctions oraLib;
	
	@Parameters("Browser")
	@BeforeClass
	public void init(String Browser) throws Throwable {
		initialization(Browser);
		SetUP(this.getClass().getSimpleName(), driver.getTitle());
		oraLib = new OracleFunctions();
	}
	
	
	
	//Login test
	@Test(priority = 1)
	public void LoginTest() throws Throwable{
		
		
		boolean blnLogin = oraLib.AP_LoginPage_login("tester1000@gmail.com", "iDeliver1", "Yes");
		Assert.assertEquals(true, blnLogin);
		
	}
	
	
	//Select Product Test
	@Test(priority = 2)
	public void SelectProduct() throws Throwable{
		
		boolean blnSelectProduct = oraLib.AP_SelectProductPage_pickproduct("1", "L");
		Assert.assertEquals(true, blnSelectProduct);
		
		}
	
	
	
	@AfterClass
	public void Flush() throws Throwable
	{
		closeBrowser();
	}
	
	
}
