@eating @smoke
Feature: Eating too many cucumbers may not be good for you
  user story:Eating too much of anything may not be good for you

  @eating
  Scenario: Eating a few is no problem
    Given John is hungry
    When he eats some cucumbers
    Then he will be full

  @eating1
  Scenario: Eating a few is no problem
    Given "John" is hungry
    When he eats 3 cucumbers
    Then he will be full
