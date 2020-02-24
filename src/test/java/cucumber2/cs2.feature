Feature: login

  @tag1
  Scenario Outline: login successfull
    Given display the login page
    When user enters "<username>","<password>"
    Then user navigate main page

    Examples: 
      | username | password    |
      | Lalitha  | password123 |

      
       @tag2
  Scenario Outline: add to cart
    Given display the home page
    When user enters "<username>","<password>"
    Then user navigate main page
      