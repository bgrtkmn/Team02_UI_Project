package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US048_TC002 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    Then User tests that all notifications are deleted by clicking the clear all button after clicking the icon
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket(); //Page object created

    /*
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


    @Then("user sees the notifications icon in the Header menu and tests that it is clickable")
    public void user_sees_the_notifications_icon_in_the_header_menu_and_tests_that_it_is_clickable() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        Assert.assertTrue(onlineMasterMarket.notificationIcon.isEnabled()); //Asserts that notification icon is clickable

    }
    */
    @Then("user tests that all notifications are deleted by clicking the clear all button after clicking the icon")
    public void userTestsThatAllNotificationsAreDeletedByClickingTheClearAllButtonAfterClickingTheIcon() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        onlineMasterMarket.viewAllNotification.click(); //Driver clicks on view all notification text
        int currentNotificationNumber = onlineMasterMarket.deleteIconList.size(); //Current notification number is assigned to the variable
        onlineMasterMarket.deleteAllButton.click(); //Driver clicks on delete all button
        int notificationNumberAfterDeletion = onlineMasterMarket.deleteIconList.size(); //Notification number is assigned to the variable
        Assert.assertEquals(currentNotificationNumber,notificationNumberAfterDeletion); //Asserts the current notification number is equals to before deletion

    }
}