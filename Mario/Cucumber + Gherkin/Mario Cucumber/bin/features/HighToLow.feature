Feature: Sort prices by High to Low

Scenario: Validate that flights prices are sorted High to Low
	Given User is on Home Page
	When User goes to flights
	And User enters his origin and destinaton and depature and arrival
	And Sorts flight price by High to Low
	Then Flights are sorted by prices from High to Low