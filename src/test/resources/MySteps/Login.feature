Feature: Scenario Outline


  Scenario Outline: Login functionality for a social networking site.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be successful
    Examples:
      |          username        | password     |
      |        username1         |    123456    |
      |       standard_user      | secret_sauce |
      |        username2         |    112233    |
      |  performance_glitch_user | secret_sauce |
      |        username3         |    456789    |
      |       problem_user       | secret_sauce |