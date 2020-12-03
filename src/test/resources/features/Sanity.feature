Feature: Sanity test evening dress website's navigation

  @sanity
  Scenario: Navigate to evening dress page successfully
    Given I navigate to the 'Automation practice' website
    Then  I hover over 'WOMEN' tab
    And  I click on'Evening Dresses' link
    Then  I can see "Evening Dresses" page

