Feature: Profile Edit
  As an authenticated user
  I want to click my Profile
  So that I can edit my email, password and clear my twitter login

  Scenario: Profile Change Password Not OK Invalid New Pass Format
    Given I am logged in
    When I navigate to the profile tab
    And I input my current password
    And I input a new password with invalid format
    Then I dont change my password
