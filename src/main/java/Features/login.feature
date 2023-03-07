
Feature: OrangeHRM Login Feature
  
  Scenario Outline: OrangeHRM Login Test Scenario
  
    Given user is already on Login Page
    When title of login page is OrangeHRM
    Then user enters "<username>" and "<password>"
    Then user clicks in login button
    Then user is on home page
    Then close the browser

      Examples: 
      | username  | password | 
      | admin			| admin123 | 

