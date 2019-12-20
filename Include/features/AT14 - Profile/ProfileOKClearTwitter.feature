Feature: Profile Edit
  As an authenticated user
  I want to click my Profile
  So that I can edit my email, password and clear my twitter login

  Scenario: Profile Edit - Clear Twitter Login OK
    Given I am logged in
    When I navigate to the profile tab
    And I input my current password
    And I check the clear twitter login checkbox
    Then I clear my twitter login
