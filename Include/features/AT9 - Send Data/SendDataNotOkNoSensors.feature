Feature: Send Sensor Data to Database
  As an authenticated user
  I want to click the send section
  So that I can send sensor data to the server

  Scenario: Send Data Not OK (no sensor) -> can send with manual input still!
    Given I am logged in
    When I click send data on the lateral menu
    Then I can check that my phone has no sensors
