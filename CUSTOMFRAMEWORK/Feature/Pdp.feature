Feature: product detail


		@smoke
		Scenario: verify product detail
		Given I opened "chrome" browser and enter "https://www.jiomart.com/" url
		When I enter "Shampo" in search text box
		Then I verify result of search
		When I click on "Dove Nutritive Solutions Hair Fall Rescue Shampoo 650 ml"
		Then verified that product page is open
		And I click on add to cart button
		And I click on cart link
		Then verify page title
		
		