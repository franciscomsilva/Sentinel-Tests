Feature: Login Not Ok Incorrect Fields
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates the login fields on the login screen

  Scenario: Verify if the app validates fields in login screen
    Given I opened the App
    When I am at the Login Screen
    And I provide incorrect login fields
    Then I dont login to the account
