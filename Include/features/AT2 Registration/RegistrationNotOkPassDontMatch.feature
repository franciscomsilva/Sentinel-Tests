Feature: Registration
  As a user
  I want to access the create account menu
  So that I can create an account

  Scenario: Registration NOT OK - Password Doesnt Match
    Given I am at the registration screen
    When I insert different passwords
    Then I dont create an account
