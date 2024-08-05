package stepdefinitions;

import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US018_TC002 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks on Repairs & Maintenance in the Categories DD menu from the Header menu and selects the Shops Button
    And User tests that the options on the screen have the text visit store
    Then Tests that available hours and service details are visible on the page that appears when the user clicks on the selected service
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();

    @Given("User clicks on Repairs & Maintenance in the Categories DD menu from the Header menu and selects the Shops Button")
    public void user_clicks_on_repairs_maintenance_in_the_categories_dd_menu_from_the_header_menu_and_selects_the_shops_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User tests that the options on the screen have the text visit store")
    public void user_tests_that_the_options_on_the_screen_have_the_text_visit_store() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Tests that available hours and service details are visible on the page that appears when the user clicks on the selected service")
    public void tests_that_available_hours_and_service_details_are_visible_on_the_page_that_appears_when_the_user_clicks_on_the_selected_service() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}