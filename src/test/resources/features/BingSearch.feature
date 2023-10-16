Feature:  Bing Search Functionality
  Agile story: As a user when I am on the Bing search page I should be able to search for
  anything and see relevant results

  Background:
    Given user is on the Bing search page

    Scenario: Search result title verification
      When user enters orange in the Bing search box
      Then user should see orange in title

  @bing
  Scenario: Search result title verification
    When user enters "orange" in the Bing search box
    Then user should see "orange" in title



