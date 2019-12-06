Feature: Send Sensor Data to Database
  As an authenticated user
  I want to click the send section
  So that I can send sensor data to the server

  Scenario: Send Data Ok (manual room selection)
    Given I am logged in
    When I click send data on the lateral menu
    And I select the room manually
    And I use the values of the sensor OR my own values
    Then I can send the data to the database
