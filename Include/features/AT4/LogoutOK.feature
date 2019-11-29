Feature: Logout
  As a user (authenticated)
  I want to access the lateral menu
  So that I can logout

  Scenario: Logout OK
    Given I am logged in
    When I click the logout button
    Then I logout of my account
