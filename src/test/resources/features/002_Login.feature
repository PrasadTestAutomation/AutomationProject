Feature: Login Validation
  As a user I should  login with correct credentials
  and I should not login with incorrect credentials

  Background:
    Given user is on the registration page

  Scenario: Login with valid credentials
    When user Enters valid email "indu2@prasad.com" and password "prasadindu"
    And clicks on login button
    Then user should be able to login successfully
#    When user clicks on Delete Account button
#    Then user should see account deleted message