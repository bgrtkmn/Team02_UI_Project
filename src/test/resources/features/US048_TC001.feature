
Feature: As a registered user I would like to have a page where I can see notifications


  Scenario: Registered interacts with notifications icon and directed to all notifications webpage

    Given user launches the browser
    And user goes to the homepage
    And user clicks login from Header menu
    And user enters their email address and clicks login
    And user enters password and clicks enter
    Then user sees the notifications icon in the Header menu and tests that it is clickable
    Then user clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to