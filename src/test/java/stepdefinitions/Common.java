package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineMasterMarket;
import pages.RepairsAndMaintenance;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Common {

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    RepairsAndMaintenance repairsAndMaintenance = new RepairsAndMaintenance();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user launches the browser")
    public void user_launches_the_browser() {

        //This scope requires no code

    }
    @Then("user goes to the homepage")
    public void user_goes_to_the_homepage(){

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver goes to the webpage

    }

    @And("user clicks login from Header menu")
    public void user_clicks_login_from_header_menu() {

        onlineMasterMarket.mainPageLoginButton.click(); //Driver clicks on the login button

    }
    @And("user enters their email address and clicks login")
    public void user_enters_their_email_address_and_clicks_login() {

        onlineMasterMarket.emailBox.sendKeys(ConfigReader.getProperty("ommProviderEmail")); //Driver sends email info to the email box
        onlineMasterMarket.enterButton.click(); //Driver clicks on the enter button

    }
    @And("user enters password and clicks enter")
    public void user_enters_password_and_clicks_enter() {

        onlineMasterMarket.passwordBox.sendKeys(ConfigReader.getProperty("ommProviderPassword")); //Driver sends password to the password box
        onlineMasterMarket.passwordLogin.click(); //Driver clicks on the login button

    }
    @Given("user tests that the search engine is visible")
    public void user_tests_that_the_search_engine_is_visible() {

        Assert.assertTrue(onlineMasterMarket.searchBar.isDisplayed()); //Driver tests that main page has search bar and visible

    }

    @Then("user sees the notifications icon in the Header menu and tests that it is clickable")
    public void user_sees_the_notifications_icon_in_the_header_menu_and_tests_that_it_is_clickable() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        Assert.assertTrue(onlineMasterMarket.notificationIcon.isEnabled()); //Asserts that notification is visible

    }

}
