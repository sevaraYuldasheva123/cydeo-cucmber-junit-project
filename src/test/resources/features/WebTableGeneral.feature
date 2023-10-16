Feature: Some of the general functionality verifications

  Background:
    Given user is already logged in to the Web table app

  Scenario: Dropdown options verification
    When user is on the Order page
    Then user sees below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |


  Scenario: Radio buttons verification
    When user is on the Order page
    Then user sees Visa  radio button option enabled

  Scenario: Radio buttons verification
    When user is on the Order page
    Then user sees Mastercard  radio button option enabled

  Scenario: Radio buttons verification
    When user is on the Order page
    Then user sees American Express  radio button option enabled

  @webTablesGeneral
  Scenario: Order place scenario
    When  user is on the Order page
    Then user chooses  "Familybea" in product section
    Then user enters "2" into Quantity
    Then user enters "John Doe" into Customer name
    Then user enters "2705 Livingstone lane" into Street
    Then user enters "Vienna" into City
    Then user enters "Virginia" into State
    Then user enters "22180" into Zip
    Then user is clicks on Visa card
    Then user enters "123456789012" card number
    Then user is enters "12/34" expiration date
    Then user clicks Process order
    Then user should see new order "John Doe" in the table on View all orders

  @webTableScenarioOutline
  Scenario Outline: Order place scenario
    When  user is on the Order page
    Then user chooses  "<productType>" in product section
    Then user enters "<quantity>" into Quantity
    Then user enters "<customerName>" into Customer name
    Then user enters "<adress>" into Street
    Then user enters "<city>" into City
    Then user enters "<state>" into State
    Then user enters "<zipCode>" into Zip
    Then user is clicks on Visa card
    Then user enters "<creditCardNum>" card number
    Then user is enters "<expirationDt>" expiration date
    Then user clicks Process order
    Then user should see new order "<customerName>" in the table on View all orders

    Examples:
      | productType | quantity | customerName   | adress         | city    | state    | zipCode | creditCardNum | expirationDt |
      | Familybea   | 5        | Steve Jobs     | 1234 smth lane | Fairfax | Virginia | 22030   | 123455432112  | 01/25        |
      | MoneyCog    | 3        | Ariana Grande | 1234 smth lane | Fairfax | Virginia | 22030   | 123455432112  | 01/25        |
      | Familybea   | 10       | Eminem         | 1234 smth lane | Fairfax | Virginia | 22030   | 123455432112  | 01/25        |





