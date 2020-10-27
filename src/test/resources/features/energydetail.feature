Feature: Energydetail

Background: 
Given I am on home page

Scenario: Verify electricity detailpage Functionality

When I click on next button
 And I click on mandatory fields
 And I enter details about electricity usage
 And I enters bill date
 And I click on next button
 Then I should go to the next page after clicking next button
 
 
 Scenario: Verify gas entrypage Functionality
 
 Given I am on gas detail page after giving all data
 When I click on valid details about gas usage
And I enter information about payment and date of bill
|GBP|25|
|date|20|
|month|10|
|year|2020|
And I click on the next button
Then should navigate to next page

