Feature: Verify 'Repairs & Maintenance' link in Categories menu

  Scenario: 'Repairs & Maintenance' link is visible in Categories menu

     Given   I open the browser
     When    I navigate to the homepage
     And     I find the 'Categories' menu in the header
     Then    I should see the 'Repairs & Maintenance' link under 'Categories'

