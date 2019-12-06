Feature: Add Locations to Favorite List
  As an authenticated user
  I want to click the favorites section
  So that I can add and remove my favorite locations

  Scenario: Favorites Add OK (from favorite tab)
    Given I am logged in
    When I press the Favorites button on the side tab
    And I click in the plus next to the room I want to favorite
    Then I can check that It was added to the favorites list both sides
