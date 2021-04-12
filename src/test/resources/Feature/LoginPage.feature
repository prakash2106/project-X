Feature: verifying Adactin details 
Scenario Outline: verifying adactin login details with valid credentials. 

	Given user is on the Adactin page 
	When user should enter the "<userName>" and "<password>" 
	
	Then user should click the login button 
	Then user should verify the search hotel 
	Then user should enter the details in search hotel  
		| location | hotel| roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom | childrenPerRoom |
		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |
		#		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |
		#		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |	
	Then user should click the search button 
	Then user should click on radiobutton 
	Then user should click on continue button 
	Then user should enter the details in book hotel  
		| firstName | lastname | billingAddress | creditCardNo | creditCardType | expiryMonth | expiryYear | cvv |
		| prakash | raj | 141.nagalamman nagar | 1234567899874561 |   Master Card | July | 2022 | 456 |
		#		| prakash | sp |  nagar | 1434567899874561 |   Master Card | July | 2029 | 564 |
		#		| prakash | kumar | chepauk | 1234567799874561 |   Master Card | July | 2020 | 956 |
	Then user should click on bookNow button 
	Examples: 
		  | userName | password |
		| prakash0 | J5M3AD |
		#        | prakash0 | J5M3AD |
		#				| prakash0 | J5M3AD |
		
		
		
		
		
		
		
		
