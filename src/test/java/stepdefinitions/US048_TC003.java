package stepdefinitions;

import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US048_TC003 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    And by clicking on the Notifications menu, the DropDown menu opens and by clicking on View all Notifications,
    the user goes to the relevant page and tests that all notifications have been deleted by pressing the delete all button
    Then User then tests that the notification has been deleted by clicking on the button box from the Notifications page and
    tests that the current page can be redirected to the home page
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();


}