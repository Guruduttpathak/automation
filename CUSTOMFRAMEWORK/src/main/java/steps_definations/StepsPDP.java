package steps_definations;

import com.webpages.PDP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsPDP {
	
	PDP pdp = new PDP();
	
	
	@When("I click on {string}")
	public void i_click_on(String productname) {
		
		pdp.clickOnproduct(productname);
	    
	}

	@Then("verified that product page is open")
	public void verified_that_product_page_is_open() {
		
		pdp.verifyProductDetailPage();
	   
	}
	@Given("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	    pdp.clickOnButton();
	}
	@Given("I click on cart link")
	public void i_click_on_cart_link() {
		pdp.clickonCartLink();
	    
	}
	@Then("verify page title")
	public void verify_page_title() throws InterruptedException {
	    pdp.verifypageTitl();
	}

}
