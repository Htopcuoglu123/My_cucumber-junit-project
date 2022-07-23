Feature:Data Driven testing is using Scenario Outline
@google_scenario_outline
  Scenario Outline: Google capital city search
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
      | country     | capital          |
      | Turkey      | Ankara           |
      | Azerbaijan  | Baku             |
      | Tajikistan  | Dushanbe         |
      | Bulgaria    | Sofia            |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
