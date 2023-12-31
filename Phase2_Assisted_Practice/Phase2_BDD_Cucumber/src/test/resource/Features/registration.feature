Feature: Registration
  BackGround:
  Given User on the home page
  And user follows "Resgister" button

  @regression
  Scenario: Create a new user
    Given User should be on the registration page
    When User fills registration  "email" with "xxx@gmail.com"
    And User fills registration "password" with "xmiei224"
    And User fills registration "confirm-password" with "xmiei224"
    And User clicks "Register" button
    Then User is created successfully
    And User return back on registration page

  Scenario: User does not follow form validations
    Given User should be on the registration page
    When user enters wrong characters
    Then Error message displayed with invalid password
    And User return back on registration page
