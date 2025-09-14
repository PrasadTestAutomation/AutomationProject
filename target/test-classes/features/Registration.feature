Feature: User Registration
  As a new user, I want to create an account, So that I can make purchases

  Background:
    Given user is on the registration page

  Scenario: Register with valid details
    When user Enters valid name "prasadindu2" and email "indu2@prasad.com"
    And user clicks on SignUp Button
    Then user should be navigated to signup page
    When user select title as Mr.
    And user enters password "prasadindu"
    And user enters date of birth
    And user clicks two checkboxes below DOB field
    And user enter firstname "prasad" lastname "indu" company "ABC" address "hyderabad"
    And user selects country "India"
    And user enters state "Telangana", City "Hyderabad", Zipcode "500000" and mobile number "1234456778"
    And user clicks the Create Account button
    Then a message about account created should be displayed
    When user clicks on continue button
    Then on homepage "Logged in as prasadindu2" is visible
    When user clicks on Delete Account button
    Then user should see account deleted message
    Then user clicks on continue button



#  Scenario: Register with missing required fields
#    When the user leaves required fields empty
#    And submits the registration form
#    Then the registration should fail
#    And appropriate error messages should be displayed
#
#  Scenario: Register with an already used email
#    When the user enters registration details with an already used email
#      | First Name | Jane          |
#      | Last Name  | Smith         |
#      | Email      | john.doe@test.com |
#      | Password   | Password123   |
#      | Date of Birth | 02/02/1992 |
#    And submits the registration form
#    Then the registration should fail
#    And an error message about email already being used should be displayed
