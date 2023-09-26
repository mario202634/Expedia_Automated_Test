
Feature: Book room 

 
  Scenario: Successfully booking room 
    Given user is on the home page
    When user chooses his destination
    And chooses the check-in date
    And chooses the check-out date
    And clicks on the search button
    And user chooses preferred hotel for stay
    And user clicks on Reserve room
    And user navigates to rooms 
    And user chooses preferred room 
    And user clicks on reserve
    And user fills in personal details
    And user presses on complete booking
    Then Message is displayed confirming booking 

