Feature: Registration
  As a user
  I want to access the create account menu
  So that I can create an account

  Scenario: Registration NOT OK - Invalid Email Format
    Given I am at the registration screen
    When I insert invalid email format
    Then I dont create an account
