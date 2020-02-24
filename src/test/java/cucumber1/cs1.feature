Feature: Registering in testmeapp

  @tag1
  Scenario Outline: successfull registration
    Given user enter inti registration page
    When user enters "<username>","<firstname>","<lastname>","<password>","<confirmpassword>","<email>","<mobilenumber>","<dob>"
    Then user navigates to login page

    Examples: 
      | username       | firstname | lastname   | password | confirmpassword | email               | mobilenumber | dob        |
      | divyabharathii | divya     | nimmagadda | divya12  | divya12         | divya12a3@gmail.com |   4356354564 | 04/01/1998 |
