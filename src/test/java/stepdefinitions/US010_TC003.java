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
public class US010_TC003 {

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    Actions actions = new Actions(Driver.getDriver());

    @Then("I should see the 'Shops' button is visible and enabled and click")
    public void iShouldSeeTheShopsButtonIsVisibleAndEnabledAndClick() throws InterruptedException {
        actions.moveToElement(onlineMasterMarket.shopselement);
        Assert.assertTrue("Shops button is not enabled!",onlineMasterMarket.shopselement.isEnabled());
        onlineMasterMarket.shopselement.click();
        Thread.sleep(1000);
}
    @Then("I should be navigated to the 'Shops' page")
    public void iShouldBeNavigatedToTheShopsPage() throws InterruptedException {
        String ExpectedUrl = "https://qa.onlinemastermarket.com/search/";
        String ActualUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals(ExpectedUrl,ActualUrl);
        Thread.sleep(1000);
        driver.quit();
    }
}