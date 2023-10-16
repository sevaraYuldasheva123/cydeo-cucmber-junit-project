Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should se below list
      | orange     |
      | apple      |
      | kivi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

  Scenario:List of pets we love
    Then I will share my favourites
      | Kangal           |
      | huskies          |
      | Golden Retriever |
      | Ragdoll          |
      | Siamese          |


  Scenario: Officer reads data about the driver
    Then  officer is able to see any data he wants
      | name      | Jane        |
      | last name | Doe         |
      | age       | 29          |
      | address   | somewhere   |
      | state     | CA          |
      | zip code  | 99999       |
      | phone     | 11122233344 |

@dataTables
  Scenario: User should be able to see all 12 month in a month dropdown
    Given user is on the dropdown page of practice tool
    Then user should see below info in a month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

