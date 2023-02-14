package steps_definations;

import com.framework.WebBase;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class Steps_background {
	
	WebBase webBase = new WebBase();

	@Given("I opened {string} browser and enter {string} url")
	public void i_opened_browser_and_enter_url(String browesr, String url) {

		webBase.openBrowser(browesr);
		webBase.openWebsite(url);

	}
	
	@After
	public void closeBrowser() {
		
		webBase.closeBrowser();
	}

}
