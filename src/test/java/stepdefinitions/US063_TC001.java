package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Dashboard;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

public class US063_TC001 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then click on the profile icon in the User Header menu
    And User selects dashboard from the DropDown menu in the header and selects the coupons element on the left of the page that opens
    And User tests that the View coupon history web element is visible from the menu that appears
    Then User tests that the add coupon web element is viewable and clickable to add a new coupon
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();

    /*
    @Given("User launches the browser")
    public void user_launches_the_browser() {

        //This scope requires no code

    }
    @Then("User goes to the homepage")
    public void user_goes_to_the_homepage(){

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver goes to the main page

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
    */

    @Then("click on the profile icon in the User Header menu")
    public void clickOnTheProfileIconInTheUserHeaderMenu() {

        onlineMasterMarket.profileIconButton.click(); //Driver clicks on the profile icon

    }
    @And("user selects dashboard from the DropDown menu in the header and selects the coupons element on the left of the page that opens")
    public void userSelectsDashboardFromTheDropDownMenuInTheHeaderAndSelectsTheCouponsElementOnTheLeftOfThePageThatOpens() {

        onlineMasterMarket.profileButtonDashboard.click(); //Driver clicks on the dashboard webelement

    }
    @And("user tests that the View coupon history web element is visible from the menu that appears")
    public void userTestsThatTheViewCouponHistoryWebElementIsVisibleFromTheMenuThatAppears() {

        //Can not be proceeded due to an error
        //Assert.assertTrue(onlineMasterMarket);

    }
    @Then("user tests that the add coupon web element is viewable and clickable to add a new coupon")
    public void userTestsThatTheAddCouponWebElementIsViewableAndClickableToAddANewCoupon() {

        //Cannot be proceeded due to an error

    }
}