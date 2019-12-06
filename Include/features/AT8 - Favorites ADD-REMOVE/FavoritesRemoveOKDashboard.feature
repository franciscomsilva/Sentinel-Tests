Feature: Add Locations to Favorite List
  As an authenticated user
  I want to click the favorites section
  So that I can add and remove my favorite locations

  Scenario: Favorites Remove OK (from dashboard)
    Given I am logged in
    When at the dashboard
    And I click in the star next to the room I want to unfavorite
    Then I can check that It was removed from the favorites list
