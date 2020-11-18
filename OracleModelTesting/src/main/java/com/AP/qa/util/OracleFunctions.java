package com.AP.qa.util;


import com.AP.qa.base.TestBase;
import com.AP.qa.pages.*;

public class OracleFunctions extends TestBase  {
	
	//Page pbject
	LoginPage pglogin;
	SelectProductPage pgselectProduct;
	PaymentPage pgpayment;
	LogoutPage pglogout;
	
	public OracleFunctions() {
		
		//Initializing Page Object
		
		pglogin = new LoginPage();
		pgselectProduct =  new SelectProductPage();
		pgpayment  = new PaymentPage();
		pglogout = new LogoutPage();
	}
	
	// From from Login Page
	  
	  public boolean AP_LoginPage_login(String strUserName, String strPasswprd, String strSignInFlag) throws Throwable {
		  
					if(strSignInFlag.equals("Yes")){
						
						pglogin.clickOn_signIn_button();
					}
					
					pglogin.setUser_Name(strUserName);
					pglogin.setPassword(strPasswprd);
					pglogin.clickOn_logIn_button();
					pglogin.clickOn_homePage_link();
					return pglogin.validateUser();	
		}
	  
	  
	  
	  // Function from Select Product Page
	  
	  public boolean AP_SelectProductPage_pickproduct(String strQty, String strPickSize) throws Throwable {
			
			try {
					pgselectProduct.hover_element();
					pgselectProduct.clickOn_tshirt_link();
					pgselectProduct.setQty(strQty);					
					pgselectProduct.setSize(strPickSize);;//Select Size -S / M /L
					pgselectProduct.clickOn_cart();
					pgselectProduct.clickOn_checkout();
					pgselectProduct.clickOn_proceed();
					return pgpayment.validateProceedAddress_button();
				}
				catch(Exception e) {
					
						String Cause = e.toString();
						//Reporting("Fail", "Home Page Validation", "homepage should displayed ", "Homepage is unable to show due to"+Cause.substring(1, 88));
						//closeBrowser();
						return pgselectProduct.validateProceed_button();
				}
			}
	  
	  
	  //Function from Payment Page
	  
	  public boolean AP_PaymentPage_payment() throws Throwable {
		  
				    pgpayment.clickOn_proceedAddress();
				    pgpayment.clickOn_shippingCheckBox();
				    pgpayment.clickOn_processCarrier();
					String FPrice = pgpayment.getAmount().replace("$", "");
					pgpayment.clickOn_payMethodAndConfirm();
					return pglogin.validateUser();
					
					}
	  
	  
	  //Function for Logut Page
	  
	  
	  public boolean AP_LogoutPage_logout() throws Throwable {
			pglogout.clickOn_signOut_button();
	        return pglogin.validateSignIn_button();
		}
	  
	  //Global Application Function
	  
	  public String AP_Page_gettitle() {
		  
		  return driver.getTitle();
	  }
			
	  
}
