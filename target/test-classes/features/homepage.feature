
Feature: Homepage
@validateHPLinks
Scenario: Validate Homepage links

Given I am on Test Environment Home Page
Then i validate Desktops 'Desktops' on the UI
And i validate Laptops & Notebooks 'Laptops & Notebooks' on the UI
And i validate Components 'Components' on the UI
And i validate Tablets 'Tablets' on the UI
And i validate Software 'Software' on the UI
And i validate Phones & PDAs 'Phones & PDAs' on the UI
And i validate Cameras 'Cameras' on the UI
And i validate MP3 Players 'MP3 Players' on the UI

