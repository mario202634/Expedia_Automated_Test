Feature: Choose specific Airline for flights

Scenario: Choose an Airline from a selected Airline
	Given User is on Home Page
	When User goes to flights
	And User enters his origin and destinaton and depature and arrival
	And User selects wanted Airline
	Then Flights shown should be provided by the choosen Airline