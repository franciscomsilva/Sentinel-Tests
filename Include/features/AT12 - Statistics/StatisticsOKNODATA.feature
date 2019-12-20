Feature: Statistics
  As an authenticated user
  I want to select the statistics tab
  So that I can check the temperature and humidity over time with various filters.

  Scenario: Statistics OK No DATA
    Given I am logged in
    And I choose daily on the statistics tab
    Then I can check that there is no data to show
