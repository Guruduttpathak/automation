package com.webpages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.WebBase;

public class SearchPage extends WebBase{
	
	private By searchvalue = By.cssSelector("#autocomplete-0-input");
	private By verifyvalue = By.cssSelector("#search_kwrd");
	
	public void entersearchvalue (String searchtext) {
		
		try {
			
			WebElement element = driver.findElement(searchvalue);
			element.sendKeys(searchtext);
			element.submit();
			
		} catch (Exception e) {
			
			Assert.fail("fail to enter text in search textbox");
		}
	}
		

	public void verifySeachPage() {
		Assert.assertTrue(driver.findElement(verifyvalue).isDisplayed());
		
	}

}
