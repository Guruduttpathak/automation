Feature: signin


		@smoke
		Scenario: verify signin page
		Given I opened "chrome" browser and enter "https://www.jiomart.com/" url
		When I clicked on signin link
		Then verified that signin page is open
		
		
		@regression
		Scenario: validation message while user enter incorrect mobile number
		Given I opened "chrome" browser and enter "https://www.jiomart.com/" url
		When I clicked on signin link
		Then verified that signin page is open
		When I enter "abc" in mobile number text box
		And I click on send button
		Then verify that validation message is displaye
		
		