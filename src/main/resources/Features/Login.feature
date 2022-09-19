
Feature: Login to website


  Scenario Outline: User login into the website with valid credentials
    Given website is open
    And   user is on the login page
    When  user enters <username> and <password>
    And   user clicks on login button
    Then  user is on logged in and can navigate to the shop

    Examples:
    |username|password|
    |lavrisha|tester1|

