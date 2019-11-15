Feature: Check Dashboard OK
  As a user
  I want to start the AUT (Sentinel.apk)
  So that I can check the Global Air Quality of the Building A

  Scenario: Check "Air quality" , "Temperature" , "Humidity" are present
    Given I opened the App
    When I arrive at the Dashboard page
    Then I can check the QoA of the Building A
