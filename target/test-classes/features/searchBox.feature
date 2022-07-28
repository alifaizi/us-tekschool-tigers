Feature: Verifying the search box on Tek School retail page
@SeachBoxTest
Scenario: Check the search box is functioning as expected

Given the user is on the Tek School retail page
When the user enter a camera in the search box
And the user click on the search button
Then the user get on the result for the camera in a separate page
Then the user click on the add to cart link