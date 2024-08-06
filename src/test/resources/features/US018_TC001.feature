
Feature: As a user I would like to have a page on the site where I can request Repair and Maintenance services

  @wip
  Scenario: Repairs & Maintenance should be visible and active in the slider on the homepage

    Given User launches the browser
    And User goes to the homepage
    And User tests that Repairs & Maintenance is visible in the header menu
    And User goes to the Repairs & Maintenance page and tests that the shops and services buttons are visible and clickable
    And User tests that the filter buttons are visible on the Repairs & Maintenance page
    Then User should be able to view the services on the Repairs & Maintenance page and be redirected to the relevant page