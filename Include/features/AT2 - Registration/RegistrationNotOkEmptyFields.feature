Feature: Registration NOT OK Empty Fields
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates empty fields

  Scenario: Verify if Empty fields are validated
    Given I opened the App
    When I am at the Registration Screen
    And I provide empty fields one by one
    Then I dont create an account successfuly
