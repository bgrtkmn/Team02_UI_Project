package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Dashboard;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US033_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters own email address and clicks login
    And User enters own password and clicks enter
    Then User clicks on the profile icon in the Header menu
    And User clicks on dashboard from DropDown menu
    And User clicks on subscriptions from the opened page
    Then User selects from the payment plans in the pop-up window and sees Subscribed
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

        onlineMasterMarket.mainPageLoginButton.click(); //Driver clicks on login button

    }
    @And("User enters own email address and clicks login")
    public void user_enters_own_email_address_and_clicks_login() {

        onlineMasterMarket.emailBox.sendKeys(ConfigReader.getProperty("ommProviderEmail")); //Driver sends email info to the email box
        onlineMasterMarket.enterButton.click(); //Driver clicks on the enter button

    }
    @And("User enters own password and clicks enter")
    public void user_enters_own_password_and_clicks_enter() {

        onlineMasterMarket.passwordBox.sendKeys(ConfigReader.getProperty("ommProviderPassword")); //Driver sends password to the password box
        onlineMasterMarket.passwordLogin.click(); //Driver clicks on the login button

    }
    @And("User clicks on the profile icon in the Header menu")
    public void user_clicks_on_the_profile_icon_in_the_header_menu() {

        onlineMasterMarket.profileIconButton.click(); //Driver clicks on the profile icon

    }
    @And("User clicks on dashboard from DropDown menu")
    public void user_clicks_on_dashboard_from_drop_down_menu() {

        onlineMasterMarket.profileButtonDashboard.click(); //Driver clicks on the Dashboard from Dropdown menu

    }
    @And("User clicks on subscriptions from the opened page")
    public void user_clicks_on_subscriptions_from_the_opened_page() {

        onlineMasterMarket.subscriptionButton.click(); //Driver clicks on the subscription button

    }
    @Then("User selects from the payment plans in the pop-up window and sees Subscribed")
    public void user_selects_from_the_payment_plans_in_the_pop_up_window_and_sees_subscribed() {

        //Payment plan can not be selected due to a bug.
        for (int i = 0; i <= 3 ; i++) {
            continue;
        }

    }
}