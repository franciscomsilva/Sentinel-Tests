Feature: My Exposure
  As an authenticated user
  I want to add rooms to my exposure
  So that I can check the QoA, the average Temperature and the Average Humidity of said exposure

  Scenario: My Exposure Remove OK
    Given I am logged in
    And i press the X button on the room I want to remove
    Then It is removed from My Exposure list
