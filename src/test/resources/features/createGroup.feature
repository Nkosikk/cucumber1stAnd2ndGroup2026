@createGroup @Regression
Feature: Create Group

  Scenario Outline: as admin user i want to login to ndosi website
    Given i am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then i should be logged in successfully
    And I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create group button
    And I enter group name <groupName>
    And I enter group description <groupDescription>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    When I click on the create group button and confirm the creation
    Then i should see the group created successfully
    And I should go back to Website home page
    And I click on the Menu Button
    And I click on the logout button
    Then I click login button
    And I click on the Sign Up Here Link
    And I should be on the registration page
    Then I verify that the group created is visible in the registration page

    Examples:
      | email             | password  | groupName | groupDescription | year | maxCapacity | startDate  | endDate    |
      | tumi@gmail.com   | @12345678 | Test Group2026 | Test description | 2027 |  6545     |  20260610  |  20270620  |



