@SmokeTest @FbTest
Feature: Facebook login feature
  User wants to verify whether it is successful or unsuccessful login

  @SmokeTest @FbTest
  Scenario: Unsuccessful login functionality
    Given User should be on login page
    And User enters email address 
    And User enters password 
    And User clicks on login button
    Then Error message should be displayed with wrong credentials
    And User return backs on login page
    