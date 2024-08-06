package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User tests that Repairs & Maintenance is visible in the header menu
    And User goes to the Repairs & Maintenance page and tests that the shops and services buttons are visible and clickable
    And User tests that the filter buttons are visible on the Repairs & Maintenance page
    Then User should be able to view the services on the Repairs & Maintenance page and be redirected to the relevant page
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket(); //Page Object created
    Actions actions = new Actions(Driver.getDriver()); //Action object created

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        //No code is required in this field
    }
    @And("User goes to the homepage")
    public void user_goes_to_the_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
        //Driver visits the webpage
    }
    @And("User tests that Repairs & Maintenance is visible in the header menu")
    public void user_tests_that_repairs_maintenance_is_visible_in_the_header_menu() {

        actions.moveToElement(onlineMasterMarket.headerMenuCategories);
        //Mouse hovers to categories in header
        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance);
        //Mouse hovers to header categories and Rep&Maint...
        Assert.assertTrue(onlineMasterMarket.categoriesRepairAndMaintenance.isDisplayed());
        //Asserts that the web element is visible

    }
    @And("User goes to the Repairs & Maintenance page and tests that the shops and services buttons are visible and clickable")
    public void user_goes_to_the_repairs_maintenance_page_and_tests_that_the_shops_and_services_buttons_are_visible_and_clickable() {

        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance).click();
        //Hovers over Rep&Maint web element an clicks
        Assert.assertTrue(onlineMasterMarket.Shops.isDisplayed());
        //Asserts that Shops web element is displayed
        Assert.assertTrue(onlineMasterMarket.Shops.isEnabled());
        //Asserts that Shops web element is clickable

        Assert.assertTrue(onlineMasterMarket.Service.isDisplayed());
        //Asserts that Shops web element is displayed
        Assert.assertTrue(onlineMasterMarket.Service.isEnabled());
        //Asserts that Shops web element is clickable

    }
    @And("User tests that the filter buttons are visible on the Repairs & Maintenance page")
    public void user_tests_that_the_filter_buttons_are_visible_on_the_repairs_maintenance_page() {

        Assert.assertTrue(onlineMasterMarket.filterElement.isEnabled());

    }
    @Then("User should be able to view the services on the Repairs & Maintenance page and be redirected to the relevant page")
    public void user_should_be_able_to_view_the_services_on_the_repairs_maintenance_page_and_be_redirected_to_the_relevant_page() {


        for (int i = 0; i < onlineMasterMarket.repairAndMaintenanceServicesList.size(); i++) {
            Assert.assertTrue(onlineMasterMarket.repairAndMaintenanceServicesList.get(i).isDisplayed());
        }
        //Asserts that all the elements in the list is visible

        String webElementName;
        for (int i = 0; i < onlineMasterMarket.repairAndMaintenanceServicesList.size(); i++) {
            webElementName = onlineMasterMarket.repairAndMaintenanceServicesList.get(i).getText();
            onlineMasterMarket.repairAndMaintenanceServicesList.get(i).click();
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(webElementName) );
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }
        //Asserts that the web elements in the link directs to the relevant webpage

    }
}