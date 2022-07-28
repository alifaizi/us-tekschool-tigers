Feature: login to Tekschool Website
  
  @singlelogin
  Scenario: Login to Tekschool Tetail page with one user
    Given I am on Tekschool Tetail page
    When I click on my account link
    And I click on login link
    Then I enter my correct username and password
    Then I click on login button
    Then I logged into the Tekschool Tetail page

