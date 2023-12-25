Feature: Verify home page
  Scenario: Verify Home Page
    Given user is on the website
    When user enter the username "login.username" and password "login.password"
    Then verify user is navigated to homepage
    When User clicks on the icon
    Then User should be on the main page