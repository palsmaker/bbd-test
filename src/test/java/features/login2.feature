@smoke, @Sanity, @Sprint
Feature: As a user I want a login page so that only authentic 
	users will be able to login 
	
#	managing number of test cases in test suite, we can tag them to invoke them as and when reqd eg,smoke,sanity test help organize
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