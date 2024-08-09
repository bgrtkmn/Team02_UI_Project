
Feature: As a registered user I want to be able to perform membership-related transactions on my Dashboard panel


  Scenario: Registered should user should be able to change subscription plan from the menu

    Given user launches the browser
    And user goes to the homepage
    And user clicks login from Header menu
    And user enters own email address and clicks login
    And user enters own password and clicks enter
    Then user clicks on the profile icon in the Header menu
    And user clicks on dashboard from DropDown menu
    And user clicks on subcsriptions from the opened page
    Then user selects from the payment plans in the pop-up window and sees Subscribed