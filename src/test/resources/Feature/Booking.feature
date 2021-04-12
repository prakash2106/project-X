Feature: verifying booking details 

Scenario: verifying order details in adactin 
	Given user is on adactin login page 
	When user should login valid credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	And user should select the mandatory fields 
		| location | roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom |
		| Brisbane | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three |
	Then user should verify the "Select Hotel" is displayed 
	Then user should enter the details to book a hotel 
		| firstName | lastname | billingAddress | creditCardNo | creditCardType | expiryMonth | expiryYear | cvv |
		| prakash | raj | 141.nagalamman nagar | 1234567899874561 |   Master Card | July | 2022 | 456 |
	Then user should click Book Now 
	Then user should verify the order No is displayed. 
	
Scenario: verifying order details without passing any fields 
	Given user is on adactin login page 
	When user should login valid credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	Then user should click Book Now 
	And user should verify "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number"is displayed 
	
	