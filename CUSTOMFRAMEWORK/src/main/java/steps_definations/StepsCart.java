package steps_definations;

import com.framework.WebBase;
import com.webpages.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsCart {
	
	WebBase webBase = new WebBase();
	CartPage cartpage = new CartPage();
	
	
	@When("I clicked cart icon")
	public void i_clicked_cart_icon() {
		cartpage.clickonSearchicon();
	    
	}

	@Then("I verified that {string} message should be displayed")
	public void i_verified_that_message_should_be_displayed(String string) {
	    
	}

}
