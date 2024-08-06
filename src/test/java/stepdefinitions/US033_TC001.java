package stepdefinitions;

import pages.Dashboard;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US033_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters own email address and clicks login
    And User enters own password and clicks enter
    Then User clicks on the profile icon in the Header menu
    And User clicks on dashboard from DropDown menu
    And User clicks on subcriptions from the opened page
    Then User selects from the payment plans in the pop-up window and sees Subscribed
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    Dashboard dashboard = new Dashboard();

    @Given("User clicks login from Header menu")
    public void user_clicks_login_from_header_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User enters own email address and clicks login")
    public void user_enters_own_email_address_and_clicks_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User enters own password and clicks enter")
    public void user_enters_own_password_and_clicks_enter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on the profile icon in the Header menu")
    public void user_clicks_on_the_profile_icon_in_the_header_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on dashboard from DropDown menu")
    public void user_clicks_on_dashboard_from_drop_down_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on subcriptions from the opened page")
    public void user_clicks_on_subcriptions_from_the_opened_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User selects from the payment plans in the pop-up window and sees Subscribed")
    public void user_selects_from_the_payment_plans_in_the_pop_up_window_and_sees_subscribed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}