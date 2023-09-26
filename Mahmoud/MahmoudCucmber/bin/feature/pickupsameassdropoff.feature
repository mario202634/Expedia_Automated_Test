Feature: pickupsameassdropoff Action

Scenario: UnSuccessful Booking 
	Given User is on Home Page
	When User Navigate to Cars
	And User enters the pickup and dropoff pickup time and dropoff time pickup date and dropoff date
	Then Error message appears
