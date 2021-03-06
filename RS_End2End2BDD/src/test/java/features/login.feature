Feature: Login into application 

Scenario Outline: positive test validation 
	Given Initialize browser with chrome 
	And Navigate to "http://www.qaclickacademy.com/" Site 
	And Click on login link in home page to land on secure sign in page 
	When User enters <username> and <Password> and logs in 
	Then Verify the user is successfully logged in 
	And broswer closes
	
	Examples: 
		|username 			|Password|
		|test123@gmail.com 	|123456|
		|sidpwr9@gmail.com	|654789|