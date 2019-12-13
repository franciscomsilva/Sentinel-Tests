Feature: My Exposure
  As an authenticated user
  I want to add rooms to my exposure
  So that I can check the QoA, the average Temperature and the Average Humidity of said exposure

  Scenario: My Exposure ADD OK
    Given I am logged in
    And i press the button next to the room I want to add
    Then It is added to My Exposure list
