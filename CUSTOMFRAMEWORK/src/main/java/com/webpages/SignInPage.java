package com.webpages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.WebBase;


public class SignInPage extends WebBase {

	private By signInLink = By.partialLinkText("Sign in");
	
	private By signInLabel = By.xpath("//*[@class='ac-title']");
	
	private By mobileNumberTextbox = By.cssSelector("#loginfirst_mobileno");
	
	private By sendButton = By.xpath("//*[@class='btn-signpass arrowbtn']");
	
	private By varificationMessage= By.xpath("//*[@class='error-msg ng-star-inserted']");
	

	public void clickOnSignLink() {
		try {
			
			driver.findElement(signInLink).click();
			
		}catch (Exception e) {
			
		Assert.fail("faild to click on signin link");
		}
		
	}

     public void verifySignInpage (){
    	 Assert.assertEquals(driver.findElement(signInLabel).getText(), "Sign in"); //label verify code
    	 //Assert.assertTrue(driver.findElement(signInLabel).isDisplayed());
    	 
     }
     
     public void enterMobilenumber(String mobilenumber) {
    	 try {
    		 WebElement element=driver.findElement(mobileNumberTextbox);
    		 element.click();
    		 element.sendKeys(mobilenumber);
    	 }catch (Exception e) {
    		 
    		 Assert.fail("fail to enter text in mobile number");
    	 }
     }
     
     public void clickOnsendbutton() {
    	 try {
    		 driver.findElement(sendButton).click();
			
		} catch (Exception e) {
			Assert.fail("fail to click on send button");
		}
     }

     public void verifyValidationmessage() {
    	 Assert.assertTrue(driver.findElement(varificationMessage).isDisplayed());
     }
}


