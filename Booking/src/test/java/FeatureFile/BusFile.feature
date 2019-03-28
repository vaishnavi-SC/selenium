Feature: RedBus Login
#Scenario: RedBus Login with Chennai to Hyd 
#Given the user lanches RedBus Url
#When user Select Chennai from Soruce Dropdown
#And user Select Hyd from Distination Dropdown
#And user select 25.3.2019 in onward date
#And user click search button

#without parameter
#Scenario: RedBus Login with Chennai to Hyd 
#Given the user lanches RedBus Url
#When user Select "Chennai" from Soruce Dropdown
#And user Select "bangalore" from Distination Dropdown
#And user select 25.3.2019 in onward date
#And user click search button


#with parameter
#Scenario Outline: RedBus Login with Chennai to Hyd 
#Given the user lanches RedBus Url
#When user Select "<source>" from Soruce Dropdown
#And user Select "<des>" from Distination Dropdown
#And user select 25.3.2019 in onward date
#And user click search button

#Examples:
#|source| des |
#|che   | bang|

#Datatable approach
Scenario: RedBus Login with Chennai to Hyd 
Given the user lanches RedBus Url
When user Select from Soruce Dropdown
|che|
And user Select from Distination Dropdown
|ban|
And user select 25.3.2019 in onward date
And user click search button