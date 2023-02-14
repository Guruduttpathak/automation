Feature: Cart


		@smoke
		Scenario: verify cart link
		Given I opened "chrome" browser and enter "https://www.jiomart.com/" url
		When I clicked cart icon
		Then I verified that "Your Cart is empty" message should be displayed
		