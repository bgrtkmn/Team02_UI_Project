
Feature: As a registered user I would like to have a page where I can see notifications


  Scenario: Registered user access to all notifications webpage from notifications icon and deletes desired notifications

    Given user launches the browser
    And user goes to the homepage
    And user clicks login from Header menu
    And user enters their email address and clicks login
    And user enters password and clicks enter
    Then user sees the notifications icon in the Header menu and tests that it is clickable
    And by clicking on the Notifications menu, the DropDown menu opens and by clicking on View all Notifications, the user goes to the relevant page and tests that all notifications have been deleted by pressing the delete all button
    Then user then tests that the notification has been deleted by clicking on the button box from the Notifications page and tests that the current page can be redirected to the home page