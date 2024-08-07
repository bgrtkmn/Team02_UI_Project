package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
//import pages.OmmCategories;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class HomePageStepDef {

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
   // OmmCategories ommCategories = new OmmCategories();
    Actions actions = new Actions(Driver.getDriver()); //Action object created


    @Then("Verify that the Categories link in the home page header section is displayed and clicked.")
    public void verify_that_the_categories_link_in_the_home_page_header_section_is_displayed_and_clicked() {
      // Assert.assertTrue(ommCategories.HeaderCategories.isDisplayed());
       // Assert.assertTrue(ommCategories.HeaderCategories.isEnabled());
    }
    @Then("Click on Categories button and confirms that it redirects to the correct page.")
    public void click_on_categories_button_and_confirms_that_it_redirects_to_the_correct_page() {
       // ommCategories.HeaderCategories.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(ConfigReader.getProperty("ommCategoriesURL"),Driver.getDriver().getCurrentUrl());
    }
    @Given("Go to the {string} url")
    public void go_to_the_url(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.waitFor(1);
    }

    @When("Accept the cookies")
    public void acceptTheCookies() {

        if (onlineMasterMarket.getLocateWithText("Accept All").isDisplayed()) {
            onlineMasterMarket.getLocateWithText("Accept All").click();
            ReusableMethods.waitFor(1);
        }
    }

    @And("Close the driver")
    public void closeTheDriver() {
        Driver.quitDriver();
    }

    @Then("Verify that the under Categories \\(Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) links are displayed and clicked.")
    public void verify_that_the_under_categories_business_services_repairs_maintenance_moving_transportation_events_personal_services_home_services_links_are_displayed_and_clicked() {
       // actions.moveToElement(ommCategories.HeaderCategories).perform();
        //Assert.assertTrue(ommCategories.BusinessServices.isDisplayed());
       // Assert.assertTrue(ommCategories.BusinessServices.isEnabled());

        Assert.assertTrue(onlineMasterMarket.homeServicesHeader.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.homeServicesHeader.isEnabled());

        Assert.assertTrue(onlineMasterMarket.movingAndTransportationHeader.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.movingAndTransportationHeader.isEnabled());

        Assert.assertTrue(onlineMasterMarket.personalServicesHeader.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.personalServicesHeader.isEnabled());

        Assert.assertTrue(onlineMasterMarket.eventsHeader.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.eventsHeader.isEnabled());

        Assert.assertTrue(onlineMasterMarket.repairsAndMaintenanceHeader.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.repairsAndMaintenanceHeader.isEnabled());

    }
    @Then("Click on \\(Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) buttons and confirms that it redirects to the correct page.")
    public void click_on_business_services_repairs_maintenance_moving_transportation_events_personal_services_home_services_buttons_and_confirms_that_it_redirects_to_the_correct_page() {
        //ommCategories.BusinessServices.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/business-services", Driver.getDriver().getCurrentUrl());

        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
        //actions.moveToElement(ommCategories.HeaderCategories).perform();
        onlineMasterMarket.homeServicesHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/home-services", Driver.getDriver().getCurrentUrl());

        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
       // actions.moveToElement(ommCategories.HeaderCategories).perform();
        onlineMasterMarket.movingAndTransportationHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/moving-and-transportation", Driver.getDriver().getCurrentUrl());

        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
        //actions.moveToElement(ommCategories.HeaderCategories).perform();
        onlineMasterMarket.personalServicesHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/personal-services", Driver.getDriver().getCurrentUrl());

        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
       // actions.moveToElement(ommCategories.HeaderCategories).perform();
        onlineMasterMarket.eventsHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/events", Driver.getDriver().getCurrentUrl());

        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
        //actions.moveToElement(ommCategories.HeaderCategories).perform();
        onlineMasterMarket.repairsAndMaintenanceHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals("https://qa.onlinemastermarket.com/search/repairs-and-maintenance", Driver.getDriver().getCurrentUrl());

    }


    @Then("Verify that on the Categories page \\(Home Services, Personal Services, Events, Business Services, Repairs & Maintenance, Moving & Transportation) category cards are displayed and clicked.")
    public void verify_that_on_the_categories_page_home_services_personal_services_events_business_services_repairs_maintenance_moving_transportation_category_cards_are_displayed_and_clicked() {


        Assert.assertTrue(onlineMasterMarket.businessServicesCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.businessServicesCardBody.isEnabled());

        Assert.assertTrue(onlineMasterMarket.homeServicesCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.homeServicesCardBody.isEnabled());

        Assert.assertTrue(onlineMasterMarket.movingAndTransportationCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.movingAndTransportationCardBody.isEnabled());

        Assert.assertTrue(onlineMasterMarket.personalServicesCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.personalServicesCardBody.isEnabled());

        Assert.assertTrue(onlineMasterMarket.eventsCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.eventsCardBody.isEnabled());

        Assert.assertTrue(onlineMasterMarket.repairsAndMaintenanceCardBody.isDisplayed());
        Assert.assertTrue(onlineMasterMarket.repairsAndMaintenanceCardBody.isEnabled());
    }
    @Then("Click on \\(Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) cards and confirms that it redirects to the correct page.")
    public void click_on_business_services_repairs_maintenance_moving_transportation_events_personal_services_home_services_cards_and_confirms_that_it_redirects_to_the_correct_page() {

        onlineMasterMarket.businessServicesCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/business-services", Driver.getDriver().getCurrentUrl());

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        onlineMasterMarket.homeServicesCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/home-services", Driver.getDriver().getCurrentUrl());

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        onlineMasterMarket.movingAndTransportationCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/moving-and-transportation", Driver.getDriver().getCurrentUrl());

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        onlineMasterMarket.personalServicesCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/personal-services", Driver.getDriver().getCurrentUrl());

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        onlineMasterMarket.eventsCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/events", Driver.getDriver().getCurrentUrl());

        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(1);
        onlineMasterMarket.repairsAndMaintenanceCardBody.click();
        ReusableMethods.waitFor(1);
        // Assert.assertEquals("https://qa.onlinemastermarket.com/search/repairs-and-maintenance", Driver.getDriver().getCurrentUrl());


    }
    @Then("User should be able to click the Home page Logo by the header side.")
    public void user_should_be_able_to_click_the_home_page_logo_by_the_header_side() {
        onlineMasterMarket.logoHeader.click();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(ConfigReader.getProperty("ommURL"),Driver.getDriver().getCurrentUrl());
    }


}
