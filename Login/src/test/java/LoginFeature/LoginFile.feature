Feature: Facebook Login
#Scenario: FB login with username and password
#Given Enter the Url
#When Enter the username and password
#|username|password|
#|mercury| mercury|

#Then user click login button

Scenario Outline: FB login with username and password
Given Enter the Url
When Enter the username"<username>" and password "<password>"


Then user click login button

Examples:
|username|password|
|mercury| mer|
|mer| mer|
|mercury|mercury|