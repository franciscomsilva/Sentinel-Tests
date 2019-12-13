Feature: Statistics
  As an authenticated user
  I want to select the statistics tab
  So that I can check the temperature and humidity over time with various filters.

  Scenario: Statistics OK Monthly
    Given I am logged in
    And I choose monthly on the statistics tab
    Then I can check the average humidity or the temperature or both
