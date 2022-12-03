Feature: user Forget Password


  Scenario Outline: Login functionality for a social networking site.
    Given users login to saucedemo
    When users enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful
    Examples:
      |   username    |   password   |
      |   username1   |     123      |
      |   username2   |     abcd     |
      | standard_user | secret_sauce |


  Scenario Outline:  User try to get password with username
    Given user forget password when login
    When user click Forget Password and Email Address is "<email>"
    Then Recover the password should be unsuccessful
    Examples:
      |          email          |
      |                         |
      |         123456          |
      |         abcdef          |
      |  admin@phptravels.com   |