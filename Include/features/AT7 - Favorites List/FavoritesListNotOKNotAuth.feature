Feature: Favorites List
  As an authenticated user
  I want to click the favorites section
  So that I can check my favorite locations

  Scenario: Favorites List NOT OK - Not Authenticated
    Given I am not logged in
    When I check the lateral menu
    And I see that there are no favorites menu
    Then I can check that only logged in users can have favorites
