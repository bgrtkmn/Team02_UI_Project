
Feature: As a registered user I want to be able to perform membership-related transactions on my Dashboard panel


  Scenario: Registered should user should be able to change subscription plan from the menu

    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters own email address and clicks login
    And User enters own password and clicks enter
    Then User clicks on the profile icon in the Header menu
    And User clicks on dashboard from DropDown menu
    And User clicks on subcsriptions from the opened page
    Then User selects from the payment plans in the pop-up window and sees Subscribed