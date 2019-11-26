Feature: Registration
  As a user
  I want to access the create account menu
  So that I can create an account

  Scenario: Registration OK
    Given I am at the registration screen
    When I insert email in use
    Then I dont create an account
