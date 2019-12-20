Feature: Profile Edit
  As an authenticated user
  I want to click my Profile
  So that I can edit my email, password and clear my twitter login

  Scenario: Profile Change Password Not OK Empty Current Password
    Given I am logged in
    When I navigate to the profile tab
    And I dont input my current password
    Then I cant update the profile
