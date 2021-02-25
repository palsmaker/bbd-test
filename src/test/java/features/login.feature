@dashboard @Smoke
    Feature: As a user I want a login page so that only authentic 
	users will be able to login 
	
#	Scenario: Valid users should be able to login 
#	Given I am on Techfios site
#	When I enter username and password
#	And I click on sign in button 
#	Then Dashboard page should display 
	
#	when there is more than one scenario or test cases we use scenario outline with examples for data parameterization with tags      
    Scenario Outline: Valid users should be able to login 
	Given I am on Techfios site
	When I enter "<username>" and "<password>"
	And I click on sign in button 
	Then Dashboard page should display
	
	Examples:
	|username|password|
	|demo@techfios|abc123|
	
