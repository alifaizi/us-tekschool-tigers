Feature: Test login functionality
@loginDemoTest
  Scenario: Check login is successful with valid credentials
    Given browser is open
    When user enters username and password
    And user click on login
    Then user is navigated to the home page
    Then user click on logout button
