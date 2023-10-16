@wiki
Feature: Wikipedia Search functionality

  Agile story: as a user I should be able to search for anything on wikipedia page and see relevant results

  Background:
    Given User is on the wikipedia search page


  Scenario:
    When user types "Steve Jobs" in wiki search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" is in the wiki title

  Scenario:
    When user types "Steve Jobs" in wiki search box
    And user clicks wiki search button
    Then  user should see "Steve Jobs" is in the main header

  Scenario:
    When user types "Steve Jobs" in wiki search box
    And user clicks wiki search button
    Then user should see "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia search functionality with Scenario Outline
    When user types "<searchValue>" in wiki search box
    And user clicks wiki search button
    Then user should see "<expectedInTitle>" is in the wiki title
    Then  user should see "<expectedInHeaderText>" is in the main header
    Then user should see "<expectedImgHeaderText>" is in the image header

    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedInTitle   | expectedInHeaderText | expectedImgHeaderText |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |






