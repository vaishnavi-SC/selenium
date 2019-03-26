Feature: Google Homepage

#Scenario Outline: Check that main elements on Google Homepage are displayed
#Given I launch Chrome browser
#When I open Google Homepage
#Then I verify that the page displays "<search>" search text box


#Examples:
#|search|
#|java|
Scenario: Check that main elements on Google Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify that the page displays "java" search text box