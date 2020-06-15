@login
Feature: Login functionality

  Background:
    Given the user is on the login page
@wip
  Scenario: Users should be able to login with valid credentials
    When the user enter valid user information
    Then the user should be able to login

  Scenario: Users shouldn't be able to login with invalid credentials
    When the user enter invalid information
    Then the user shouldn't be able to login