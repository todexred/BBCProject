#Author: Tobi
Feature: BBC Sign in

  @SignIn
  Scenario Outline: As a Registered user I want sign in sucessfully
    Given I am on the BBC homepage
    And I click sign in
    And I type email address "<email>" in the email field
    And I type password account "<password>" in  the password field
    When I click Sign in button
    Then I verify that I am logged in successfully
    And I log out from my account

    Examples: 
      | email                | password  |
      | todexred@yahoo.co.uk | carpet723 |
