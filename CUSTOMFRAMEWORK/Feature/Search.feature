Feature: Search

@smoke
		#Scenario: verify product detail
		Scenario Outline: verify that search suggestion page is open for multiple search value
		Given I opened "chrome" browser and enter "https://www.jiomart.com/" url
		When I enter "<Search>" in search text box
		Then I verify result of search
		
		
		Examples:
		    | Search | #this is label name
		    | Shampoo | #this is value
		    | Mobile |
		    
		