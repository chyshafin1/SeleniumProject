Feature: Automate Testleaf Application

Scenario Outline: TC001_login and logout

Given Launch Chrome brwser and load url
And  Enter username as <username>
And  Enter Password as <password>
When click the lgoin button
Then Its navigate HomePage  
And click logout button 
And close browser

Examples:
							|username|password|
							|DemoSalesManager|crmsfa|
							|DemoCSR|crmsfa|



Scenario: TC002_login and logout for faliure

Given Launch Chrome brwser and load url
And  Enter Username as sdsdsd
And  Enter Password as crmsfa
When click the lgoin button
Then Its navigate Same HomePage 
But verify error message
And close browser