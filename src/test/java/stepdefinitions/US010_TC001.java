package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.HomePagee;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import static utilities.Driver.driver;

public class US010_TC001 {

    HomePagee homePage = new HomePagee();
    Actions actions = new Actions(Driver.getDriver());

    @Given("I open the browser")
    public void iOpenTheBrowser() {
        //No code required in this field.
    }

    @When("I navigate to the homepage")
    public void iNavigateToTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
    }

    @And("I find the 'Categories' menu in the header")
    public void iFindTheCategoriesMenuInTheHeader() throws InterruptedException {
        actions.moveToElement(homePage.homePageCategories).perform();;
        homePage.homePageCategories.click();
        Thread.sleep(3000);
    }

    @Then("I should see the 'Repairs & Maintenance' link under 'Categories'")
    public void iShouldSeeTheRepairsMaintenanceLinkUnderCategories() throws InterruptedException {
        //No code required in this field.

        Thread.sleep(3000);

        // WebDriver'ı kapat
        driver.quit();
    }

}
