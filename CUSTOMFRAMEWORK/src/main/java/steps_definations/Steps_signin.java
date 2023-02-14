package steps_definations;
import com.webpages.SignInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_signin {

	
	SignInPage signinpage = new SignInPage();

	
	@When("I clicked on signin link")
	public void i_clicked_on_signin_link() {

		signinpage.clickOnSignLink();
	}

	@Then("verified that signin page is open")
	public void verified_that_signin_page_is_open() {

		signinpage.verifySignInpage();
	}

	

	@When("I enter {string} in mobile number text box")
    public void i_enter_in_mobile_number_text_box(String mobilnumber) {
       signinpage.enterMobilenumber(mobilnumber); 
    }
	@When("I click on send button")
	public void i_click_on_send_button() {
	    signinpage.clickOnsendbutton();
	}

    @Then("verify that validation message is displaye")
    public void verify_that_validation_message_is_displaye() {
        signinpage.verifyValidationmessage();
    }
    
	
}
