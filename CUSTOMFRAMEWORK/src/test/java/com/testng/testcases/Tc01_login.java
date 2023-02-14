package com.testng.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.WebBase;
import com.webpages.SignInPage;

public class Tc01_login {
	SignInPage signInPage = new SignInPage();

	WebBase webbase = new WebBase();
	String browserName = "chrome";
	String Url = "https://www.jiomart.com/";
	
	@BeforeMethod
	public void setUp() {
		
		webbase.openBrowser(browserName);
		webbase.openWebsite(Url);
	}
	
	@Test
	(description = "verify login page", priority=1)
	public void verifyLoginpage() {
		signInPage.clickOnSignLink();
		signInPage.verifySignInpage();
		
	}

	@AfterMethod
	public void closeBrowser() {
		webbase.closeBrowser();
	}
}
