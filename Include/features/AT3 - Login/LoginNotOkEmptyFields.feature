Feature: Login Not Ok Empty Fields
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates the empty fields on the login screen

  Scenario: Verify if the app validates empty fields in login screen
    Given I opened the App
    When I am at the Login Screen
    And I provide empty login fields
    Then I dont login to the account
