Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given Browser is open
    And user is on the login page
    When user enters username and password
    And user clicks on the login button
    Then user is navigated to the home page