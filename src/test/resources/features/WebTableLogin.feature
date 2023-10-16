Feature: WebTable page login functionality

  Agile story: as a user i should be able to log in to the page

  Background:
    Given user is on the login page of webTable


  Scenario: login as tester
    When user enters Test as a username
    And  user enters Tester as a password
    And user clicks login button
    Then expected URL should end with orders


  Scenario: login as tester
    When user enters "Test" as a username
    And  user enters "Tester" as a password
    And user clicks login button
    Then expected URL should end with "orders"


  @webTables
  Scenario: User should be able to login with correct credentials
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then expected URL should end with orders
