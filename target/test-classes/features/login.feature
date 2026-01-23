Feature: Login Feature
@smoke
  Scenario Outline: TC01_Login with valid credentials
    Given user is logged in for login scenario
    When user enters the username "<email>" and password "<password>"
    Then user should be redirected to the dashboard
    
 
  
   Examples:
  | email                      | password      |
  | arunkumarsaratha@gmail.com | Nehasree@20  |
  
