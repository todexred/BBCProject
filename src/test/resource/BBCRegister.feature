Feature: BBC Register New User


@Register
  Scenario Outline: As a new user I want create an account
    Given I am on the BBC homepage
    And i click sign in
    And I click Register now
    And i type the day "<day>" in the field provided
    Then i type the Month "<month>" in the field provided
    And I type the year "<year>" in the field provided
    Then I click Next
    And I type email "<email>" in the email field
    And I type password "<password>" in  the password field
    And I insert postcode "<postcode>" in the postcode field
    Then I click on the gender drop downlist
    Then from the gender drop downlist I select Female
    And I select No email personalisation
    And I click Register
  #  Then I verify that i am registered successfully
  

    Examples: 
      | email                  | password | postcode | day | month | year |
      | lodiecambell@yahoo.com | today222 | SE15 1NX |  22 |    12 | 1991 |
     # | kate@hotmail.co.uk     | now890   | TW2      |  01 |    11 | 2000 |
