Feature: Registration NOT OK Email Already in Use
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check if the app validates emails that are already in use

  Scenario: Verify if Email is already in use
    Given I opened the App
    When I am at the Registration Screen
    And I provide email that is already in use by an account
    Then I dont create an account successfuly
