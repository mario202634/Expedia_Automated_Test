Feature: Check for error message after not selecting destination

Scenario: Validate error when not selecting destination
	Given User is on Home Page
	When User goes to flights
	And User enters his origin and depature and arrival
	Then An error message saying please select destination should appear