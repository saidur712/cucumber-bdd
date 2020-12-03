Feature: Regression test special offer page

  @regression
  Scenario: Verify user is able to view a signal spacial offer item in women tab.
    Given I navigate to the 'Automation practice' website
    Then  I click on 'WOMEN' tab from top left of the page
    And I verify signal item shows in 'SPACIAL' section bottom left of the page
    Then i click on the item 'image'
    And  I close the 'Browser'
