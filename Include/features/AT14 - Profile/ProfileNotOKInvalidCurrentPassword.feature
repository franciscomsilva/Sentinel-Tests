Feature: Profile Edit
  As an authenticated user
  I want to click my Profile
  So that I can edit my email, password and clear my twitter login

  Scenario: Profile Change Password Not OK Invalid Current Password
    Given I am logged in
    When I navigate to the profile tab
    And I input my current password incorrectly
    Then I get an error refering to the current password
