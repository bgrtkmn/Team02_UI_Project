
Feature: As a user I would like to have a page on the site where I can request Repair and Maintenance services

  @wip
  Scenario: From Repairs & Maintenance menu user can move to related links written visit store below

    Given User launches the browser
    And User goes to the homepage
    And User clicks on Repairs & Maintenance in the Categories DD menu from the Header menu and selects the Shops Button
    And User tests that the options on the screen have the text visit store
    Then Tests that available hours and service details are visible on the page that appears when the user clicks on the selected service