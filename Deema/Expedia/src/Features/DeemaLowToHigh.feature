Feature: Low to high prices displayed


  Scenario: Prices of Stays to reserve ae ordered from cheapest to most expensive
    Given user is on stays page
    When user chooses low to high sort
    Then different hotels and stays appear in order of cheapest to most expensive
