package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBase {

	public static WebDriver driver;
	
	public void openBrowser(String browserName) {
		
		if (browserName.toLowerCase().contains("chrome")) {
			
			driver=new ChromeDriver();
			
		}else if(browserName.toLowerCase().contains("firefox")) {
			
			driver=new FirefoxDriver();
			
		}else {
			driver=new EdgeDriver();
		}
			
	}
	
	public void openWebsite(String url) {
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
