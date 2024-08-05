package stepdefinitions;

import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US048_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    Then User clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();

    @Given("User enters their email address and clicks login")
    public void user_enters_their_email_address_and_clicks_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User enters password and clicks enter")
    public void user_enters_password_and_clicks_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees the notifications icon in the Header menu and tests that it is clickable")
    public void user_sees_the_notifications_icon_in_the_header_menu_and_tests_that_it_is_clickable() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to")
    public void user_clicks_on_the_notifications_menu_to_open_the_drop_down_menu_and_clicks_on_view_all_notifications_to_test_that_the_relevant_page_has_been_navigated_to() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}