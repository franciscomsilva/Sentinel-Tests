Feature: Login
  As a user (unauthenticated)
  I want to access the login page
  So that I can login

  Scenario: Login OK
    Given I am at the login page
    When I provide the correct login fields
    Then I login to my account
