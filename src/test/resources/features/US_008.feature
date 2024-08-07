Feature:As a user, I would like to be able to see all the companies and services on the site in categories under the Categories heading.

  Background:
    Given Go to the "ommURL" url

  @testIY01
  Scenario: [US_008 > TC_001] The 'Categories' link should be visible in the homepage header section and redirect to the relevant page.

    Then Verify that the Categories link in the home page header section is displayed and clicked.
    And Click on Categories button and confirms that it redirects to the correct page.
    And Close the driver

  @testIY02
  Scenario: [US_008 > TC_002] Under Categories (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) links should be visible.

    Then Verify that the under Categories (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) links are displayed and clicked.
    And Click on (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) buttons and confirms that it redirects to the correct page.
    And Close the driver

  @testIY03
  Scenario: [US_008 > TC_003] On the Categories page (Home Services, Personal Services, Events, Business Services, Repairs & Maintenance, Moving & Transportation) category cards should be visible and active.
    Then Click on Categories button and confirms that it redirects to the correct page.
    And Verify that on the Categories page (Home Services, Personal Services, Events, Business Services, Repairs & Maintenance, Moving & Transportation) category cards are displayed and clicked.
    And Click on (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) cards and confirms that it redirects to the correct page.
    And Close the driver

  @testIY04
  Scenario: You should be able to switch from the Categories page to the Home page.

    Then Click on Categories button and confirms that it redirects to the correct page.
    And User should be able to click the Home page Logo by the header side.
    And Close the driver







