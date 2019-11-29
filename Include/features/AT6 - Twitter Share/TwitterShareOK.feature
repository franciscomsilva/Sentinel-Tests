Feature: Share on Twitter
  As a user (authenticated)
  I want to share the QoA information on the room selected on twitter
  So that my followers can check the QoA information on the room selected

  Scenario: Share on Twitter OK
    Given I am logged in
    When I press the share button
    And I authorize the app for twitter
    And edit the message to tweet
    And press the tweet button
    Then I can share the message on twitter
