Feature: Click 'Shops' button on the 'Repairs & Maintenance' page

  Scenario: Click the 'Shops' button on the 'Repairs & Maintenance' page

  Given   I am on the homepage
  When    I locate the 'Categories' menu in the header
  When    I click on the 'Repairs & Maintenance' link under 'Categories'
  Then    I should see the 'Shops' button is visible and enabled and click
  Then    I  should be navigated to the 'Shops' page