package com.AP.qa.test;




import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.AP.qa.base.TestBase;
import com.AP.qa.pages.LoginPage;
import com.AP.qa.pages.LogoutPage;
import com.AP.qa.pages.PaymentPage;
import com.AP.qa.pages.SelectProductPage;
import com.AP.qa.util.Excel_Libraries;
import com.AP.qa.util.Genral_Function;
import com.AP.qa.util.OracleFunctions;
import com.AP.qa.util.TestUtil;

public class TC002_Multiple_Products_Checkout_2 extends TestBase{

	OracleFunctions oraLib;

	

	
	@Parameters("Browser")
	@BeforeClass
	public void init(String Browser) throws Throwable {
		initialization(Browser);
		SetUP(this.getClass().getSimpleName(), driver.getTitle());
		oraLib = new OracleFunctions();
		
	}
	
	@Test//(dataProvider = "Run")
	public void TC002_Multiple_Products_Checkout() throws Throwable {
		
		//Login Test
		boolean blnLogin = oraLib.AP_LoginPage_login("tester1000@gmail.com", "iDeliver1", "Yes");
		Assert.assertEquals(true, blnLogin);
		
		
		//Select Product Test
		boolean blnSelectProduct = oraLib.AP_SelectProductPage_pickproduct("1", "L");
		Assert.assertEquals(true, blnSelectProduct);
		
		//Payment Test
		boolean blnPayment = oraLib.AP_PaymentPage_payment();
		Assert.assertEquals(true, blnPayment);
		
		//Logout Test
		boolean blnLogout = oraLib.AP_LogoutPage_logout();
		Assert.assertEquals(true, blnLogout);

	}
			
		
	
	
	@AfterClass
	public void Flush() 
	{
		closeBrowser();
	}
	
	
}
