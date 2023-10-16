Feature: Etsy search functionality

  Agile story: As a user I should be able to search for anything on Etsy search page and see the results

  Background:
    Given user is on the etsy search page


  Scenario: Etsy title verification
    Then user sees title as "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"


  Scenario: Etsy search functionality title verification(no parameterization)
    When user types Wooden Spoon in the search box
    And user clicks etsy search button
    Then user sees Wooden Spoon in the title

  @etsy
  Scenario: Etsy search functionality title verification(with parameterization)
    When user types "Wooden Spoon" in the search box
    And user clicks etsy search button
    Then user sees "Wooden spoon" in the title


