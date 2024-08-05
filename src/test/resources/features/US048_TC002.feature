
Feature: As a registered user I would like to have a page where I can see notifications

  @wip
  Scenario: Registered user should be able to clear all notifications with "clear all" button

    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    Then User tests that all notifications are deleted by clicking the clear all button after clicking the icon