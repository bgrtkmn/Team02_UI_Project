
Feature: As a user I would like to have a page on the site where I can request Repair and Maintenance services


  Scenario: Repairs & Maintenance should be visible and active in the slider on the homepage

    Given user launches the browser
    And user goes to the homepage
    And user tests that Repairs & Maintenance is visible in the header menu
    And user goes to the Repairs & Maintenance page and tests that the shops and services buttons are visible and clickable
    And user tests that the filter buttons are visible on the Repairs & Maintenance page
    Then user should be able to view the services on the Repairs & Maintenance page and be redirected to the relevant page