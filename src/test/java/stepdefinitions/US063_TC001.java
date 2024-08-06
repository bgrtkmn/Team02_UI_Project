package stepdefinitions;

import pages.Dashboard;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US063_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then click on the profile icon in the User Header menu
    And User selects dashboard from the DropDown menu in the header and selects the coupons element on the left of the page that opens
    And User tests that the View coupon history web element is visible from the menu that appears
    Then User tests that the add coupon web element is viewable and clickable to add a new coupon
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    Dashboard dashboard = new Dashboard();


}