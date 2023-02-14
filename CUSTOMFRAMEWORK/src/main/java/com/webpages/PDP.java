package com.webpages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.WebBase;

public class PDP extends WebBase {
	
	private By lstProduct = By.cssSelector(".category_name.prod-name");
	private By productTitle = By.xpath("//*[@id=\"center_col\"]/div/h1");
	private By clickonButton = By.xpath("//*[@class='toCart addtocartbtn prodbtn']");
	private By clickonCartLink = By.xpath("//*[@class=\"cart_text\"]");
	private By verifypageTitle = By.xpath("//*[@class='row']/span");
	
	public void clickOnproduct(String productname) {
		try {
			
			Thread.sleep(5000);
			List<WebElement> productCategory = driver.findElements(lstProduct);
			for(WebElement element: productCategory) {
				
				String getProductTitle = element.getAttribute("title");
				if(getProductTitle.equals(productname)) {
					element.click();
					break;
					
				}else {
					System.out.println(productname +"is not matched with" +getProductTitle + ".So,check again");
				}
			}
			
		} catch (Exception e) {
			Assert.fail("Unable to click on product:" +productname);
		}				
	}
	
	public void verifyProductDetailPage() {
		Assert.assertTrue(driver.findElement(productTitle).isDisplayed());
		
		
	}
	public void clickOnButton() {
		
		driver.findElement(clickonButton).click();
	}
	public void clickonCartLink() {
		driver.findElement(clickonCartLink).click();
	}
	
	public void verifypageTitl() throws InterruptedException {
		Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(verifypageTitle).isDisplayed());
	
	}
}
