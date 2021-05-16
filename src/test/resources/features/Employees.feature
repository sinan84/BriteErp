Feature: Employees Module

  Background:
    Given the user login as "Manufacturing_manager"
    And the user navigate the module "Employees"


  Scenario: Verify title Calendar
    Then the title should be "Employees - Odoo"
