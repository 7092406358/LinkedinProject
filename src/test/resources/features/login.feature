@regression
Feature: Login Feature
@ECPREC-5141
  Scenario Outline: TC01_Login with valid credentials
    Given user is on the login page
    When user enters the username "<email>" and password "<password>"
    Then user should be redirected to the dashboard
  
   Examples:
  | email                      | password      |
  | arunkumarsaratha@gmail.com | Nehasree@19  |
  