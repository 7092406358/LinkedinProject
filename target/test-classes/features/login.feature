Feature: Login Feature
@smoke
  Scenario Outline: TC01_Login with valid credentials
    Given user is logged in for login scenario
    When user enters the username "<email>" and password "<password>"
    Then user should be redirected to the dashboard
    
    @smoke
   Scenario Outline: TC02_Login with invalid credentials
  Given user is logged in for login scenario
  When user enters the username "<email>" and password "<password>"
  Then user should see an error message Invalid username or password
  
   Examples:
  | email                      | password      |
  | arunkumarsaratha@gmail.com | errorsdsd@19  |
   
  
