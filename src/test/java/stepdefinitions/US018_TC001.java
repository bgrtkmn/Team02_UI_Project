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

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket(); //Page object created
    Actions actions = new Actions(Driver.getDriver()); //Action object created

    @Given("User2 launches the browser")
    public void user_launches_the_browser() {

        //No code is required in this field

    }
    @And("User goes to the homepage")
    public void user_goes_to_the_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver visits the webpage

    }
    @And("User tests that Repairs & Maintenance is visible in the header menu")
    public void user_tests_that_repairs_maintenance_is_visible_in_the_header_menu() {

        actions.moveToElement(onlineMasterMarket.headerMenuCategories).perform(); //Mouse hovers categories in header menu
        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance).perform(); //Mouse hovers to header categories and Repair&Maintenance
        Assert.assertTrue(onlineMasterMarket.categoriesRepairAndMaintenance.isDisplayed()); //Asserts that the web element is visible


    }
    @And("User goes to the Repairs & Maintenance page and tests that the shops and services buttons are visible and clickable")
    public void user_goes_to_the_repairs_maintenance_page_and_tests_that_the_shops_and_services_buttons_are_visible_and_clickable() {

        ReusableMethods.bekle(1); //Driver waits for 1 second

        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance).perform(); //Mouse hovers Repairs and Maintenance
        onlineMasterMarket.headerCategoriesRepAndMaint.click(); //Driver clicks on Repairs and Maintenance

        ReusableMethods.bekle(1); //Driver waits for 1 second

        Assert.assertTrue(onlineMasterMarket.Shops.isDisplayed()); //Asserts that Shops web element is displayed
        Assert.assertTrue(onlineMasterMarket.Shops.isEnabled()); //Asserts that Shops web element is clickable
        Assert.assertTrue(onlineMasterMarket.Service.isDisplayed()); //Asserts that Shops web element is displayed
        Assert.assertTrue(onlineMasterMarket.Service.isEnabled()); //Asserts that Shops web element is clickable


    }
    @And("User tests that the filter buttons are visible on the Repairs & Maintenance page")
    public void user_tests_that_the_filter_buttons_are_visible_on_the_repairs_maintenance_page() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        Assert.assertTrue(onlineMasterMarket.filterElement.isEnabled()); //Asserts that filter icon is clickable

    }
    @Then("User should be able to view the services on the Repairs & Maintenance page and be redirected to the relevant page")
    public void user_should_be_able_to_view_the_services_on_the_repairs_maintenance_page_and_be_redirected_to_the_relevant_page() {

        ReusableMethods.bekle(1); //Driver waits for 1 second

        for (int i = 0; i < onlineMasterMarket.repairAndMaintenanceServicesList.size(); i++) {

            Assert.assertTrue(onlineMasterMarket.repairAndMaintenanceServicesList.get(i).isDisplayed()); //Asserts that all the elements in the list is visible

        }

        String webElementName;
        for (int i = 0; i <= onlineMasterMarket.repairAndMaintenanceServicesList.size(); i++) {

            ReusableMethods.bekle(1); //Driver waits for 1 second
            webElementName = onlineMasterMarket.repairAndMaintenanceServicesList.get(i).getText();
            onlineMasterMarket.repairAndMaintenanceServicesList.get(i).click();
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(webElementName)); //Asserts that the web elements in the link directs to the relevant webpage
            ReusableMethods.bekle(2); //Driver waits for 2 seconds
            Driver.getDriver().navigate().back(); //Driver navigates to previous page
        }

    }
}