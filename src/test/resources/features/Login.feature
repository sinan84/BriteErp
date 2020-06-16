@login
Feature: Login functionality


  Scenario: Users should be able to login with valid credentials
    When the user enter valid user information
    Then the user should be able to login


  Scenario: Login as Manufacturing Manager
    When the user login as "contact"
    Then the user should be able to login


  Scenario Outline: Login as <userType>
    When the user login as "<userType>"
    Then the user should be able to login
    Examples:
      | userType              |
      | Manufacturing_manager |
      | Inventory             |
      | pos                   |
      | event_manager         |
      | Expense_manager       |
      | sales                 |
      | calendar              |
      | lunch                 |
      | crm                   |
      | event                 |


  Scenario: Users shouldn't be able to login with invalid credentials
    When the user enter invalid information
    Then the user shouldn't be able to login

  @wip
  Scenario Outline: Users shouldn't be able to login with <invalid>
    When the user enter "<userName>" and "<Password>"
    Then the user must see Login and, or password are wrong. message

    Examples:
      | userName              | Password  | invalid                     |
      | manuf_user10@info.com | wrongpass | wrong password              |
      | wrongUsername         | manufuser | wrong username              |
      |                       | manufuser | blank username              |
      | manuf_user10@info.com |           | blank password              |
      |                       |           | blank username and password |