Feature: AddCart test

  Scenario Outline: Login functionality for a social networking site.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario Outline:user CheckOut
    Given user open Shopping Card And click CHECKOUT
    When  user enter FirstName as "<FirstName>" and LastName as "<LastName>" and Zip/PostalCode as "<Zip/PostalCode>"
    Then Whether the payment was successful
    Examples:
      | FirstName | LastName | Zip/PostalCode |
      | Haoyang   | Zhang    |    1111        |
      | Allen     | Smith    |    2222        |
      | Diana     | White    |    3333        |
      | Evelyn    | Clark    |    4444        |