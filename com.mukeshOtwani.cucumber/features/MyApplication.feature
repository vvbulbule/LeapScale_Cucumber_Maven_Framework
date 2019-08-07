Feature: Test Facebook smoke scenario

	Scenario Outline: Login with valid credentials 

	Given Open Chrome and start application
	When I enter valid "<username>" and valid "password"
	Then user should able to login sccessfully
	Then the application should be closed

	Examples:
	|username      |   password    |
	|vvbulbule@gmail.com      |   vvbulbule    |
	|vvbulbule1@gmail.com      |   vvbu    |
	|poonam@gmail.com      |   12345    |