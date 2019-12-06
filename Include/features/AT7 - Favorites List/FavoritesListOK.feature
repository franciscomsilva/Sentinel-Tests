Feature: Favorites List
  As an authenticated user
  I want to click the favorites section
  So that I can check my favorite locations

  Scenario: Favorites List OK
    Given I am logged in
    When I press the Favorites button on the side tab
    Then I can check that there are no favorites added
