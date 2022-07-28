Feature: Login to Test Environment Website

Background: 
    Given I am on Test Environment Home Page
    When I click on My Account button
    And I click on Login link

  @loginTest
Scenario: Login to Test Environment with One User
    And I enter my username and password
    And I click on login button
    Then I am logged into my Test Environment account

  @multiloginTest
Scenario Outline: Login with multiple users
    And I enter my username '<username>' and password '<password>'
    And I click on login button
    Then I am logged into my Test Environment account

    Examples: 
      | username            | password |
      | tigers001@gmail.com | meira10  |
      | tigers002@gmail.com | meira10  |
      | tigers003@gmail.com | meira10  |


#Feature: List of Scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table / We can pass out data in form of table using vertical pipes as separators
#In table under examples keyword, the first line is alway headers and then we can start adding out test data from second line
#Background: List of steps run before each of the scenarios
# Steps that are repeated for each scenario/scenario outline,
