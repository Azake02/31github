Feature: Verify Login Functionality
  Scenario: Verify user can login into the application
    Given user is on the website
    When user enter the username "login.username" and password "login.password"
    Then verify user is navigated to homepage
    When user clicks on subscription button
    Then verify user is on subscription page
    When user clicks on subscribe button
    Then verify user is subscribed