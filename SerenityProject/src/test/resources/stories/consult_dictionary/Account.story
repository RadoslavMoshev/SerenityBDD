Sample story

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  User account is logged in and logged out
Given I am on Login page
When I am authenticated
Then I am on My Account Dashboard
Then Logging out I return to the Login page

Scenario:  User account can change currency
Given I am on Logged in
When I am at hotels page
Then I change the currency
Then I see prices with the new currency

Scenario:  User can filter search by star grade
Given I am logged in and im on hotels page
When I search hotels by star grade
Then I see only hotels with filtered stars

Scenario:  User can navigate and logout from Invoice menu
Given I am logged in My Account Page
When I open Invoice
Then I click My Account
Then I shoud be able to click Account or Logout buttons

Scenario:  Tours extras should be calculated
Given I am booking Tour
When I select Extras
Then Extras prices are added to the Total amount

Scenario:  User can't log in with valid username and wrong pasword
Given I am on login page
When I enter valid username and wrong password
Then Error is displayed

Scenario:  User can write a review
Given I am on Hotels page
When I enter hotel details
Then I can Write Review

Scenario:  User can change password
Given I am on My Profile page
When I change my password
Then I can log in with the new one
And old password is not valid

Scenario:  User can search Flights
Given I am on Flights page
When I fill search criteria
Then Flights matching the criteria are displayed
