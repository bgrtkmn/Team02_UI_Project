Feature: US_023 As a user, I would like to have an area with prominent companies on the homepage of the site.

  Background:
    Given Go to the "ommURL" url

  @testIY2301
  Scenario: [US_023 > TC_001] Featured Shop title should be visible in the home body section.

    Then Verify that the Featured Shop title in the home body section is displayed.
    And Close the driver

  @testIY2302
  Scenario: [US_023 > TC_002] Company name, location information should be visible in the slide under the title, Visit store icon should be visible and active, when clicked, it should redirect to the relevant page.

    Then Verify that the Company name, location information are displayed.
    And Click on Visit store icon button and confirm that it redirect to the correct page.
    And Close the driver

  @testIY2303
  Scenario: [US_023 > TC_003] The View All icon under the title should be visible and active, when clicked, it should redirect to the relevant page.

    Then Click on View All icon under the title button and confirm that it redirect to the correct page.
    And Close the driver







