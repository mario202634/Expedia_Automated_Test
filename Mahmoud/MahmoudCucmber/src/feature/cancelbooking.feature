Feature: CancelBook Action

Scenario: Successful cancellation 
	Given User is on Home Page
	When User Navigate to Support
	And User selects the card of the booking
	And user click on the options
	Then User successfully cancel the booking
