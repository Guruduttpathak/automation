package steps_definations;

import com.webpages.SearchPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepssearch {
	
	SearchPage searchPage = new SearchPage();
	
	
	@When("I enter {string} in search text box")
	public void i_enter_in_search_text_box(String searchvalue) {
		
		searchPage.entersearchvalue(searchvalue);
	    
	}

	@Then("I verify result of search")
	public void i_verify_result_of_search() {
	
	    
	
	}

}
