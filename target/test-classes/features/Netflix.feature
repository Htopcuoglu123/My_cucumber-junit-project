
Feature: Movie suggestion feature
  User story:As a user I should be able to get movies according to my preferences

  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I get to homepage
    Then I should get the right recommendation


    Scenario: Movie search datatable list
      Given I like
        | actions   |
        | drama     |
        | cartoon   |
        | adventure |
      When I get to homepage
      Then I should get the right recommendation

  @Netflix
      Scenario: Movie search dataTable map
        Given I like below favorite movie with certain type
          | actions   | John Wick   |
          | drama     | Titanic     |
          | cartoon   | Tom&Jerry   |
          | adventure | Tomb Raider |
        When I get to homepage
        Then I should get the right recommendation


