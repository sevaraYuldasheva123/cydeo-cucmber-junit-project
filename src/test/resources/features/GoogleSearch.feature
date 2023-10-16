Feature: Google Search Functionality
  Agile story: As a user when I am on the Google search page I should be able to search for
  anything and see relevant results

  Background:
    Given user is on the Google search page

  Scenario: Search page default title verification
    Then user should be able see title is Google

  Scenario: Apple Search result title verification
    When user search for "apple"
    Then user should be able to see title as "apple - Google Search";

  @wip
  Scenario: Orange Search result title verification
    When user search for orange
    Then user should be able to see orange - Search
