
Feature: As a registered user (provider) I want to have an area where I can see and manage my coupons


  Scenario: Staffs link should be visible and active in Provider Dashboard sidebar

    Given user launches the browser
    And user goes to the homepage
    And user clicks login from Header menu
    And user enters their email address and clicks login
    And user enters password and clicks enter
    Then click on the profile icon in the User Header menu
    And user selects dashboard from the DropDown menu in the header and selects the coupons element on the left of the page that opens
    And user tests that the View coupon history web element is visible from the menu that appears
    Then user tests that the add coupon web element is viewable and clickable to add a new coupon