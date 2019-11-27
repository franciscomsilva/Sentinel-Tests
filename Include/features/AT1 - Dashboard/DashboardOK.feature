Feature: Dashboard Page
  As a User (unauthenticated)
  I want to Open the app
  So that I can check the QoA of the Building A

  Scenario: Dashboard OK
    Given I open the Sentinel App
    Then I verify the QoA in the Building A
