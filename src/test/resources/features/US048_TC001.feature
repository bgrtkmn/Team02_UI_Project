
Feature: As a registered user I would like to have a page where I can see notifications


  Scenario: Registered interacts with notifications icon and directed to all notifications webpage


    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    Then User clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to