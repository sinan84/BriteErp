Feature: Calendar Module

  Background:
    Given the user login as "Manufacturing_manager"
    And the user navigate the module "Calendar"

@wip
  Scenario: Verify title Calendar
    Then the title should be "Meetings - Odoo"
@smoke
  Scenario: Verify default option of Account Dropdown
    Then Account drop down should have Savings selected

  Scenario: Verify options of Account Dropdown.
    Then Account drop down should have the following options:
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
