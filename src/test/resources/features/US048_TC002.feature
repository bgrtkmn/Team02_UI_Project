
Feature: As a registered user I would like to have a page where I can see notifications


  Scenario: Registered user should be able to clear all notifications with "clear all" button

    Given user launches the browser
    And user goes to the homepage
    And user clicks login from Header menu
    And user enters their email address and clicks login
    And user enters password and clicks enter
    Then user sees the notifications icon in the Header menu and tests that it is clickable
    Then user tests that all notifications are deleted by clicking the clear all button after clicking the icon