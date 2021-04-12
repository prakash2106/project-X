Feature: verifying Adactin details 

Scenario Outline: verifying search hotel is opening 
	Given user is on adactin login page 
	When user should enter the login credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	And user should select the "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>","<childrenPerRoom>"and click search 
	Then user should verify "Select Hotel" is displayed 
	
	Examples: 
		| location | hotel| roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom | childrenPerRoom |
		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |
		
Scenario:
verifying the page is navigated to select hotel by giving mandatory fields 
	Given user is on adactin login page 
	When user should login valid credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	And user should select the mandatory fields  
		| location | roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom |
		| Brisbane | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three |
	Then user should verify the "Select Hotel" is displayed 
	
Scenario: verifying date field in search hotel 
	When user should enter the login credentials 
		| userName | password |
		| prakash0 | J5M3AD |
	And user should select the "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>","<childrenPerRoom>"and click search 
		| location | hotel| roomType | numberOfRooms | checkInDate| checkOutDate | adultsPerRoom | childrenPerRoom |
		| Brisbane | Hotel Hervey | Double | 5 - Five | 03/05/2021 | 10/05/2021 | 3 - Three | 3 - Three |
	Then user should verify the "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date" is displayed 
	Then user should verify "Select Hotel" is displayed 

Scenario: verifying search hotel without entering the fields 	
Given user is on adactin login page 
	When user should enter the login credentials 
		| userName | password |
		| prakash0 | J5M3AD |
		And user should click search
		Then user needs to verify the "Please Select a Location" is displayed
		
