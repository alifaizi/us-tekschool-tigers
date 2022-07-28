Feature: Registeration

 @dataTbaleTest
  Scenario: Register with Test Environment  Website
  
    Given I am on Test Environment Home Page
    When I click on My Account button
    And I click on register link
    And I fill the registration form
      | firstname | lastname  | email                         | telephone  | password  | confirmPassword |
      | tigers    | tekschool | tigerstekschool2020@gmail.com | 1234567891 | tigers123 | tigers123       |
    And I subscribe to newsletter
    And I agree to privacy policy
    And I click on continue button
    Then I validate my account is created successfully
