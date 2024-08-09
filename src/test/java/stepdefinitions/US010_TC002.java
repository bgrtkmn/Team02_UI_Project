package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import static utilities.Driver.driver;

public class US010_TC002 {

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    Actions actions = new Actions(Driver.getDriver());

    @Given("I am on the homepage")
    public void ı_am_on_the_homepage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
        Thread.sleep(1000);
    }

    @When("I locate the 'Categories' menu in the header")
    public void ı_locate_the_menu_in_the_header() throws InterruptedException {
        actions.moveToElement(onlineMasterMarket.headerMenuCategories);
        onlineMasterMarket.headerMenuCategories.click();
        Thread.sleep(1000);
    }

    @When("I click on the 'Repairs & Maintenance' link under 'Categories'")
    public void ı_click_on_the_link_under() throws InterruptedException {
        actions.moveToElement(onlineMasterMarket.categoriesRepairAndMaintenance);
        onlineMasterMarket.categoriesRepairAndMaintenance.click();
        Thread.sleep(1000);
    }

    @Then("I should see the 'Shops' button is visible and enabled")
    public void i_should_see_the_shops_button_is_visible_and_enabled() throws InterruptedException {
        actions.moveToElement(onlineMasterMarket.shopselement);
        Assert.assertTrue("Shops button is not enabled!",onlineMasterMarket.shopselement.isEnabled());
        Thread.sleep(1000);

    }

    @And("I should see the 'Service' button is visible and enabled")
    public void i_should_see_the_service_button_is_visible_and_enabled() throws InterruptedException {
        actions.moveToElement(onlineMasterMarket.serviceelement);
        Assert.assertTrue("Shops button is not enabled!",onlineMasterMarket.serviceelement.isEnabled());
        Thread.sleep(1000);
        driver.quit();
    }

}
