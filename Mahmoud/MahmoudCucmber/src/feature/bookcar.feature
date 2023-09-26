Feature: BookCar Action

Scenario: Successful Booking 
	Given User is on Home Page
	When User Navigate to Cars
	And User enters the pickup and dropoff pickup time and dropoff time pickup date and dropoff date
	And User Selects a car
	And User books a car
	Then User successfully booked a car
