Feature: Sign In Feature

Background:
Given User is on retail website

  @SignInTest
  Scenario: Verify user can sign in into Retail Application
    When User click on Sign in option
    And User enter email 'john123@gmail.com' and password 'Kabul759339$'
    And User click on login button
    Then User should be logged in into Account
    

  @CreateAccount
  Scenario: Verify user can create an account into Retail Website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email          | password  | confirmPassword |
      | naqib | naqib@gmail.com | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
