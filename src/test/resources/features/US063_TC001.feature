
Feature: As a registered user (provider) I want to have an area where I can see and manage my coupons

  @wip
  Scenario: Staffs link should be visible and active in Provider Dashboard sidebar

    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then click on the profile icon in the User Header menu
    And User selects dashboard from the DropDown menu in the header and selects the coupons element on the left of the page that opens
    And User tests that the View coupon history web element is visible from the menu that appears
    Then User tests that the add coupon web element is viewable and clickable to add a new coupon