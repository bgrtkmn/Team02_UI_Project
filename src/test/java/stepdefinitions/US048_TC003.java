package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US048_TC003 {

    /*
    Given User launches the browser
    And User goes to the homepage
    And User clicks login from Header menu
    And User enters their email address and clicks login
    And User enters password and clicks enter
    Then User sees the notifications icon in the Header menu and tests that it is clickable
    And by clicking on the Notifications menu, the DropDown menu opens and by clicking on View all Notifications,
    the user goes to the relevant page and tests that all notifications have been deleted by pressing the delete all button
    Then User then tests that the notification has been deleted by clicking on the button box from the Notifications page and
    tests that the current page can be redirected to the home page
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


    @And("user sees the notifications icon in the Header menu and tests that it is clickable")
    public void user_sees_the_notifications_icon_in_the_header_menu_and_tests_that_it_is_clickable() {

        Assert.assertTrue(onlineMasterMarket.notificationIcon.isDisplayed()); //Asserts that notification icon is visible
        Assert.assertTrue(onlineMasterMarket.notificationIcon.isEnabled()); //Asserts that notification icon is clickable

    }
    */
    @And("by clicking on the Notifications menu, the DropDown menu opens and by clicking on View all Notifications, the user goes to the relevant page and tests that all notifications have been deleted by pressing the delete all button")
    public void byClickingOnTheNotificationsMenuTheDropDownMenuOpensAndByClickingOnViewAllNotificationsTheUserGoesToTheRelevantPageAndTestsThatAllNotificationsHaveBeenDeletedByPressingTheDeleteAllButton() {

        onlineMasterMarket.notificationIcon.click();    //Driver clicks on notification button
        onlineMasterMarket.viewAllNotification.click(); //Driver clicks on view all notification button
        onlineMasterMarket.deleteAllButton.click();     //Driver clicks on delete all notification button
        int numberOfNotifications = onlineMasterMarket.deleteIconList.size(); // Assigns the notification number of the current page to the variable
        Assert.assertEquals(0, numberOfNotifications); //Asserts that number of notifications equals to zero

    }
    @Then("user then tests that the notification has been deleted by clicking on the button box from the Notifications page and tests that the current page can be redirected to the home page")
    public void userThenTestsThatTheNotificationHasBeenDeletedByClickingOnTheButtonBoxFromTheNotificationsPageAndTestsThatTheCurrentPageCanBeRedirectedToTheHomePage() {

        int numberOfNotificationOfAllPages = 0; // current notification number is zero. Will be incremented with each iteration

        for (int i = 0; i <= onlineMasterMarket.notificationListPageNumber.size(); i++) { // 0 1 2 3 4 >
            for (int j = 0; j <= onlineMasterMarket.deleteIconList.size(); j++) { // 0 1 2 3 4 5 6 7 8 9

                numberOfNotificationOfAllPages++; // for each iteration increments the number of notification number
                ReusableMethods.bekle(1); //Driver waits for 1 second
                onlineMasterMarket.deleteIconList.get(i).click(); //Click on notification deletion icon
                onlineMasterMarket.confirmOfNotificationDeletion.click(); //Driver confirms notification deletion

            }
        }
        Assert.assertEquals(0,numberOfNotificationOfAllPages); //Asserts that remaining notification number is zero
        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver returns to the main page
    }
}