Feature: Check that price displayed on flights is the same as in checkout

Scenario: Validate that flights prices shown on card is the same as the checkout price
	Given User is on Home Page
	When User goes to flights
	And User enters his origin and destinaton and depature and arrival
	And User select a specific flight
	And User proceeds to checks out
	Then Flights check out price should be same as flight card price