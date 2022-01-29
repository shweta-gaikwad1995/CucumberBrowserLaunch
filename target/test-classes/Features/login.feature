# Author
# Date
# Description
#
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
 #Examples: | username | password |
  #         | 9876543211  |   admin |
     #      | 9876543212  |    admin1 |
