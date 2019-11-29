Feature: Check Rooms
  As a user (authenticated)
  I want to dashboard page
  So that I can access all the QoA info of every room available

  Scenario: Check Rooms OK
    Given I am logged in
    When I click on the room selector
    Then I can check the QoA in the various rooms
