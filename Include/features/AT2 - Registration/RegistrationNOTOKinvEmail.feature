Feature: Registration NOT OK Invalid Email
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates the email field on the registration screen

  Scenario: Verify if the app validates the email field
    Given I opened the App
    When I am at the Registration Screen
    And I provide an invalid email format
    Then I dont create an account successfuly
