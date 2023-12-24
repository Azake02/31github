Feature: Verify profile page

  Background:
    Given user is on the website
    When user enter the username "login.username" and password "login.password"
    Then verify user is navigated to homepage

  Scenario: Verify user is on proflie page
    When user clicks on icon
    Then verify is on profile page