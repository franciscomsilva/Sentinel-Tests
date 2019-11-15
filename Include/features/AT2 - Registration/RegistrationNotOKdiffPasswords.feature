Feature: Registration NOT OK Different password and password confirmation
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates the password/password confirmation fields on the registration screen

  Scenario: Verify if the app validates different password/password Confirmation
    Given I opened the App
    When I am at the Registration Screen
    And I provide an different password and password confirmation
    Then I dont create an account successfuly
