Feature: Verify 'Repairs & Maintenance' link and its related page elements

  Scenario: Visibility and Activation of 'Shops' and 'Service' Buttons under 'Repairs & Maintenance' Link

    Given    I am on the homepage
    When     I locate the 'Categories' menu in the header
    And      I click on the 'Repairs & Maintenance' link under 'Categories'
    Then     I should see the 'Shops' button is visible and enabled
    And      I should see the 'Service' button is visible and enabled
