package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.RepairsAndMaintenance;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US018_TC002 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks on Repairs & Maintenance in the Categories DD menu from the Header menu and selects the Shops Button
    And User tests that the options on the screen have the text visit store
    Then Tests that available hours and service details are visible on the page that appears when the user clicks on the selected service
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket(); // Main page object created
    RepairsAndMaintenance repairsAndMaintenance = new RepairsAndMaintenance(); // repairs and maintenance object created
    Actions actions = new Actions(Driver.getDriver()); // actions object created

    @Given("user3 launches the browser")
    public void user_launches_the_browser() {

        ReusableMethods.bekle(1); //Driver Waits 1 second

    }
    @And("user goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver visits desired webpage
        ReusableMethods.bekle(1); //Driver Waits 1 second

    }
    @And("User clicks on Repairs & Maintenance in the Categories DD menu from the Header menu and selects the Shops Button")
    public void user_clicks_on_repairs_maintenance_in_the_categories_dd_menu_from_the_header_menu_and_selects_the_shops_button() {

        actions.moveToElement(onlineMasterMarket.headerMenuCategories).perform(); //Mouse hovers to categoriesMenu in header
        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance).perform(); //Mouse hovers to header categories and Rep&Maintenance...
        onlineMasterMarket.headerCategoriesRepAndMaint.click(); //Clicks Rep&Maintenance from DD menu
        ReusableMethods.bekle(1); //Driver Waits 1 second
        repairsAndMaintenance.Shops.click(); //Driver Clicks on Shops Button

    }

    @And("User tests that the options on the screen have the text visit store")
    public void user_tests_that_the_options_on_the_screen_have_the_text_visit_store() {

        ReusableMethods.bekle(1); //Driver Waits 1 second
        for(int i = 0 ; i <= repairsAndMaintenance.shopsVisitStoreText.size(); i++){
            Assert.assertTrue(repairsAndMaintenance.shopsVisitStoreText.get(i).getText().contains("Visit Store ")); //Asserts that elements have "Visit Store" text
        }

    }

    @Then("Tests that available hours and service details are visible on the page that appears when the user clicks on the selected service")
    public void tests_that_available_hours_and_service_details_are_visible_on_the_page_that_appears_when_the_user_clicks_on_the_selected_service() {

        repairsAndMaintenance.Service.click(); //Driver clicks on "Service" button
        ReusableMethods.bekle(1); //Driver waits for 1 second

        for(int i = 0 ; i <= repairsAndMaintenance.servicesList.size(); i++){
            repairsAndMaintenance.servicesList.get(i).click(); //Driver clicks on i.the element
            Assert.assertTrue(repairsAndMaintenance.priceInfo.isDisplayed()); //Asserts that the page has price information
            Assert.assertTrue(repairsAndMaintenance.availabilityOfService.isDisplayed()); //Asserts that the page has availability information
            Driver.getDriver().navigate().back(); //Driver navigates back to the previous webpage
            ReusableMethods.bekle(1); // Driver waits for 1 second
        }

    }
}