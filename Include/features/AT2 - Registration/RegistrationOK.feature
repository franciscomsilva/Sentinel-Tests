Feature: Registration OK
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can create an account

  Scenario: Create an Account
    Given I opened the App
    When I am at the Registration Screen
    And I provide the correct fields
    Then I successfully register and account
