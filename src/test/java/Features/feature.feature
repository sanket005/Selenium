Feature: Application Login

@LoginTestCase
Scenario Outline: Login with valid credentials
Given Open any Browser
#And Navigate to Login page
When User enters username as "<Username>" and password as "<Password>" into the fields
And User clicks on Login button
Then Login status should be "<Status>"
Examples:
|Username|Password|Status|
|Admin   |admin123|PASS  |
|2313    |dsfsfds |FAIL  |