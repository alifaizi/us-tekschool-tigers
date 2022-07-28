Feature: Desktop Items
@desktopItems
Scenario: Validate Tablets tab on the UI

#Steps

Given I am on Test Environment Home Page
When I hover my mouse over desktop dropdown
Then I see show all desktops link
And I click on show all desktops link
And I validate the Tablets tab on the UI

