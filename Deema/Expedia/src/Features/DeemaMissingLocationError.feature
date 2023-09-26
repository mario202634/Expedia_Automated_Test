Feature: Missing location


  Scenario: Missing destination of location of stay
    Given user is on home page
    When user picks check-in and check-out date
    Then error message is displayed to fill out location

