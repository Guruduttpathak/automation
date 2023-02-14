package com.webpages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.framework.WebBase;



public class CartPage extends WebBase {
	
	private By icon = By.xpath("//*[@class='cart_text']");
	private By messagedisplay = By.xpath("//*[@class='cart-empty']//h3");
	
	public void clickonSearchicon() {
		try {
			
			driver.findElement(icon).click();
			
		} catch (Exception e) {
			Assert.fail("cart icon can not be found");
		}
	}
	
	public void messagedislay (String emptycartmsg) {
		
		Assert.assertEquals(driver.findElement(messagedisplay).getText(),emptycartmsg);

}
}