# Author: Ricardo
#Language: en

Feature: Find out the U de A official site using the browser google chrome
	As an Student I need to search the U de A site to access to see it's content 

Scenario: Search the U de A official page using google chrome.
		Given I am in the google page
		When I type u de a on google chrome
		Then I can see the udea's official page 
