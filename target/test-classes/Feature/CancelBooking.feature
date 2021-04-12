Feature: verifying the bookingcancellation 

Scenario: verifying the cancel order of existing booking
	Given user is on adactin login page 
	When user should login valid credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	Then user should click on Booked Itinerary 
	Then user should verify  "T5051E9X7T" which he have booked 
	Then user should click on cancel.pop up will be displayed user should click ok or accept
	Then user should verify "The booking has been cancelled."is displayed
	
Scenario Outline: verifying the ordernumber and cancel the booking 
	Given user is on adactin login page 
	When user should login valid credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	Then user should click the login button 
	Then user should verify the search hotel 
	Then user should enter the details in search hotel 
		| location | hotel| roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom | childrenPerRoom |
		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |
	Then user should click the search button 
	Then user should click on radiobutton 
	Then user should click on continue button 
	Then user should enter the details in book hotel 
		| firstName | lastname | billingAddress | creditCardNo | creditCardType | expiryMonth | expiryYear | cvv |
		| prakash | raj | 141.nagalamman nagar | 1234567899874561 |   Master Card | July | 2022 | 456 |
	Then user should click on bookNow button 
	Then verify the orderNo is displayed
	And click on My Itinerary and pass "<orderNumber>" and cancel booking
	Then user should verify "The booking has been cancelled." is displayed
	Examples:
	| orderNumber |
	| 3KC26G6Y1J |
	
	
	
	
	
	
