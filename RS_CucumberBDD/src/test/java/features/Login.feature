Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with valid "Jin" and password "1234"
Then Home page is populated
And Cards are displayed are "true"

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with valid "John" and password "5678 "
Then Home page is populated
And Cards are displayed are "false"