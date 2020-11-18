package com.AP.qa.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AP.qa.base.TestBase;
import com.AP.qa.util.TestUtil;



public class SelectProductPage extends TestBase{
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	WebElement proceed;
	
	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	  WebElement orderDetails;	

	@FindBy(xpath = "//tr[contains(@class,'first_item')]")
	  WebElement orderTable;
		
	@FindBy(xpath = "//tr[contains(@class,'first_item')]//a[2]")
	  WebElement selectFirstOrder;
	
	@FindBy(xpath = "//span[contains(text(),'tester demo')]")
	  WebElement profile;
	
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement Tshirt;
	
	@FindBy(xpath = "//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-image-container']")
	 WebElement Target;
	
	@FindBy(xpath = "//input[@id='quantity_wanted']") 
	  WebElement qty;
	
	@FindBy(xpath = "//div[@id='uniform-group_1']//following-sibling::option")
	 List < WebElement> size;
	 
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	  WebElement cart;

	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	  WebElement checkout;
	
	@FindBy(xpath = "//div[@class='box-info-product']")
	  WebElement frame;
	
	@FindBy(xpath = "//ul[@id='homefeatured']//following-sibling::li")
	  List<WebElement> MultiProducts;
	
	@FindBy(xpath = "//li[contains(@class,'ajax_block_product col-xs-12 col-sm-4 col-md-3')]//span[contains(text(),'Add to cart')]")
	  List<WebElement> Addtocart;
	
	@FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']")
	  WebElement ContinueShop;
	
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	  WebElement ProccedCheckout;
	
	@FindBy(xpath = "//span[contains(@id,'total_product_price')]")
	List<WebElement> Price;
	
	@FindBy(xpath = "//span[@id='total_price']")
	  WebElement TotalPrice;
	
	@FindBy(xpath = "//td[@id='total_shipping']")
	WebElement tax;
	
	@FindBy(xpath = "//td[@id='total_shipping']")
	  WebElement FinalProced;
	
	
	  int counter=0;
	
	public SelectProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void hover_element(){
		TestUtil.MoveElement(Target);
	}
	
	
	public void clickOn_proceed(){
		proceed.click();
		
	}
	
	public void clickOn_tshirt_link() throws Throwable{
		Tshirt.click();
		WaitForObject(qty, "Check");
	}
	
	public void setQty(String strqty){
		qty.clear();
		qty.sendKeys(strqty);
		
	}
	
	public void setSize(String strsize){
		TestUtil.SelectQuantity(size, strsize);
		
	}
	
	public void clickOn_cart() throws Throwable{
		cart.click();
		WaitForObject(checkout, "Check");
	}
	
	public void clickOn_checkout(){
		
		checkout.click();
		
	}
	
	public boolean validateProceed_button(){
		
		return proceed.isDisplayed();
		
	}
	
	public void clickOn_proceedToCheckout(){
		ProccedCheckout.click();
		
	}
	
	
	/*public void order_product(String Product) throws Throwable {
		
		
		switch (Product) {
		case "Single":
			
			try {
				TestUtil.MoveElement(Target);
				Tshirt.click();
				WaitForObject(qty, "Check");
				qty.clear();
				qty.sendKeys(prop.getProperty("Qty"));
				
				TestUtil.SelectQuantity(size, "L");//Select Size -S / M /L
				cart.click();
				WaitForObject(checkout, "Check");
				checkout.click();
				}
				catch(Exception e) {
					String Cause = e.toString();
					Reporting("Fail", "Home Page Validation", "homepage should displayed ", "Homepage is unable to show due to"+Cause.substring(1, 88));
					closeBrowser();
				}
			
			break;
			
		case "Multi":
			try {
				int multiproducts  = Integer.parseInt(prop.getProperty("MultiProduct"));
				
				for(int j = 0;j<multiproducts;j++ ) {
						
					System.out.println(MultiProducts.size());
						for(int i=0;i<=MultiProducts.size();i++)
						{
							try {
							if(Excel_Libraries.getdata(j).isEmpty()==false) {
								Reporting("Pass", j+1+" Validation for Input Value", "There must be an Input value", " Input Value"+Excel_Libraries.getdata(j));
								if(MultiProducts.get(i).getText().contains(Excel_Libraries.getdata(j)))
								{
									TestUtil.MoveElement(MultiProducts.get(i));
									WaitForObject(Addtocart.get(i), "Click");
									counter=counter+1;
									break;
								}
							}
						}
						catch(Exception f){
							f.printStackTrace();
							Reporting("Fail", j+1+" Validation for Input Value", "There must be an Input value", " Input Value"+Excel_Libraries.getdata(j));
						}
						}
						
						if(counter==multiproducts) {
							ProccedCheckout.click();
						}
						else
							WaitForObject(ContinueShop, "Click");		
				}
			
				
				}
				catch(Exception e) {
					String Casue = e.toString();
					Reporting("Fail", "Home  Page  Validation", "Home Page should displayed ", "Home Page is unable to show due to"+Casue.substring(1, 88));
					closeBrowser();
				}
					break;
					
		case "Reorder":
			WaitForObject(profile, "Click");		
			orderDetails.click();
			selectFirstOrder.click();
			
			break;
		
				default:
					
					break;
		}
		}*/
	
	
	public static PaymentPage BeforeLogin_PriceValidation(Boolean a) {
		try {
		
		if(a==true) {
			return new PaymentPage();
		}
		}catch(Exception e) {
			
		}
		return  null;
	}
	
	
	
	public static PaymentPage AfterLogin_PriceValidation(Boolean a) {
		try {
		
		if(a==true) {
			return new PaymentPage();
		}
		}catch(Exception e) {
			
		}
		return  null;
	}
	
	
}
	
		
		
