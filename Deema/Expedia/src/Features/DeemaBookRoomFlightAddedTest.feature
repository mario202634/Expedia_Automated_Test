Feature: Book room with flight added 


  Scenario: Successfully Booking room with a flight
    Given user is on the home page
		When user chooses his destination
    And chooses the check-in date
    And chooses the check-out date
    And checks the add a flight check box
    And user chooses leaving from
    And user fills out necessary information about flight
    And user clicks search
    And user navigates to all available stays 
    Then Message is displayed confirming booking with flight


