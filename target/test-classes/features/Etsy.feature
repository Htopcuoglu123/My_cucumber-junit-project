
Feature: Etsy title verification
  User story: User sees title is as expected.
  Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
  everyone

Background:
  Given user on the Etsy homepage

  Scenario: Etsy title verification
    Then user see the title as expected

  Scenario: Etsy Search Functionality Title Verification
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

    Scenario: Etsy Search Functionality Title Verification (with parameterization)
      When User types "Wooden Spoon" in the search box
      And User clicks search button
      Then User sees "Wooden Spoon" is in the title


