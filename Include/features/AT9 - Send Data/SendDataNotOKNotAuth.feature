Feature: Send Sensor Data to Database
  As an authenticated user
  I want to click the send section
  So that I can send sensor data to the server

  Scenario: Send Data Not OK (not authenticated)
    Given I am not logged in
    When I click on the lateral menu
    And I verify that there is no send data button
    Then I cant send data to the database
