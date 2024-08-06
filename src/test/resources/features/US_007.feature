Feature: UI - Homepage
  Check Homepage Products List

  Background:
    Given I go to Homepage


  @wip
  Scenario: Homepage | Verify Product Lists visible and filtered
    Then I verify that the Products link under Shops is visible and redirects to the relevant page
    And I should be able to view products on the Product Lists page
    When I click on any product on the Product Lists page, I verify the details of that product.
    Then I verify that the Add to Cart and Buy Now buttons are visible and active on the product's details page.
    And I should be verify that the product quantity information has been updated on the product details page.
    Then I verify that the Add to Cart button is visible on the product card on the Product Lists page.
    And I verify that the All Categories and Price filter cards on the Product Lists page are visible.
    Then The checkboxes in the price filter card must be clickable.
    And I can filter in All Categories and Price filter cards.
