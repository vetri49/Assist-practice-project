@SmokeTest @Fb2Test
Feature: Facebook login feature
  User wants to verify whether it is successful or unsuccessful login

  @SmokeTest @Fb2Test
  Scenario: Unsuccessful login functionality
    Given User should be on login page
    And User enters email address "<username>"
    And User enters password "<password>"
    And User clicks on login button
    Then Error message should be displayed with wrong credentials
    And User return backs on login page
    Examples:
      | username | password |
      | abc      | nvunirg  |
      | pqr      | cmeooevo |
      | lmn      | voefpfnc |
