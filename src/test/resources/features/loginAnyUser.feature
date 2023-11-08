@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Login to the Dashboard

    When user enters the username "employee_username" and password "employee_password"
    Then user should be able to login
