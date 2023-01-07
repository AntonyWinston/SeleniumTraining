@Feature1
Feature: To validate the login functionality of bisto application

Background:
Given To launch the chrome browser and maximize window
When To validate in launnch url

@win
Scenario: To validate user enter the testing site
And To click the acount button
And To valid to pass the username 
And to invalid pass the password
And To click the login button
Then To invalid mobile number

@wins
Scenario: To valid the User successfully add the Dosa
Given that I am logged in as a user and on the home page
And To see the “HOME” button on the page and click it.
And To see a dropdown labeled “Dosa”
And To click the dosa button

@dum
Scenario: To the user fills out the registration form and ignores the confirm password
Given  To am logged in as a user and on the home page
And To click the “Account” button
And To register a invalid name and phone number
And To skil the conform password
And To click the register button
Then Get the pop up


@Ink
Scenario: To valid the user search for the “Coke” can and check the price
Given To am logged in as a user and on the home page
And To click the “search” icon
And To search “Coke”
Then To check the dollar is “$ 1.50”

@grip
Scenario: To validate the user selects the “Spanish Omelet”
Given To click the search icon
And To find the omelet  and click it
And To select the option of probability
Then To select the dollar probability

@truble
Scenario: To validate user read “Our Story”
Given To logged in as a user and on the home page
And To Click the “Our Story” option
Then Check the spelling mistake





