package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US048_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    Then User clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();


    @Given("User launches the browser")
    public void user_launches_the_browser() {

        //This scope requires no code

    }
    @Then("User goes to the homepage")
    public void user_goes_to_the_homepage(){

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver goes to the webpage

    }

    @And("User clicks login from Header menu")
    public void user_clicks_login_from_header_menu() {

        onlineMasterMarket.mainPageLoginButton.click(); //Driver clicks on the login button

    }
    @And("User enters their email address and clicks login")
    public void user_enters_their_email_address_and_clicks_login() {

        onlineMasterMarket.emailBox.sendKeys(ConfigReader.getProperty("ommProviderEmail")); //Driver sends email info to the email box
        onlineMasterMarket.enterButton.click(); //Driver clicks on the enter button

    }
    @And("User enters password and clicks enter")
    public void user_enters_password_and_clicks_enter() {

        onlineMasterMarket.passwordBox.sendKeys(ConfigReader.getProperty("ommProviderPassword")); //Driver sends password to the password box
        onlineMasterMarket.passwordLogin.click(); //Driver clicks on the login button

    }
    @Then("User sees the notifications icon in the Header menu and tests that it is clickable")
    public void user_sees_the_notifications_icon_in_the_header_menu_and_tests_that_it_is_clickable() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        Assert.assertTrue(onlineMasterMarket.notificationIcon.isEnabled()); //Asserts that notification is visible

    }
    @Then("User clicks on the Notifications menu to open the DropDown menu and clicks on View All Notifications to test that the relevant page has been navigated to")
    public void user_clicks_on_the_notifications_menu_to_open_the_drop_down_menu_and_clicks_on_view_all_notifications_to_test_that_the_relevant_page_has_been_navigated_to() {

        onlineMasterMarket.notificationIcon.click(); //Driver clicks on the notification button
        onlineMasterMarket.viewAllNotification.click(); //Driver clicks on view all notification text
        String currentURL = Driver.getDriver().getCurrentUrl(); //Current URL is assigned to the variable
        Assert.assertTrue(currentURL.contains("Notification")); //Asserts that current URL contains "Notification"

    }
}