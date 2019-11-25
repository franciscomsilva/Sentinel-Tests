Feature: Dashboard Page
  As a User (unauthenticated)
  I want to Open the app without internet
  So that I can check that I cant check the QoA of the Building A

  Scenario: Dashboard Not OK (internet)
    Given I open the Sentinel App
    Then I verify that i cant check the QoA in the Building A
