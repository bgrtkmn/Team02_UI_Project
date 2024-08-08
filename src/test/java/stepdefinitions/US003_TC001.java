package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.OnlineMasterMarket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US003_TC001 {

    /*
    Given user launches the browser
    And user goes to homepage
    And user tests that the search engine is visible
    And user tests that the quick service links on the homepage are visible
    Then user tests that clicking on the quick service links on the homepage takes them to the relevant link
     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket(); //Page Object created
    Actions actions = new Actions(Driver.getDriver());  //Actions object created

    @Given("user1 launches the browser")
    public void user_launches_the_browser() {

        //No code required in this field.

    }
    @Given("user1 goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("ommURL")); //Driver visits desired webpage
        ReusableMethods.bekle(1); //Driver waits for 1 second

    }
    @Given("user tests that the search engine is visible")
    public void user_tests_that_the_search_engine_is_visible() {

        Assert.assertTrue(onlineMasterMarket.searchBar.isDisplayed()); //Driver tests that main page has search bar and visible

    }
    @Given("user tests that the quick service links on the homepage are visible")
    public void user_tests_that_the_quick_service_links_on_the_homepage_are_visible() {

        ReusableMethods.bekle(1); //Driver waits for 1 second
        actions.moveToElement(onlineMasterMarket.mostPopularServicePosition).perform(); // Moved to quick service section

        int count = 1;
        for (int i = 0; i <= onlineMasterMarket.quickServicesList.size(); i++) { //Loop for quick services list
            ReusableMethods.bekle(1); //Driver waits for 1 second
            Assert.assertTrue(onlineMasterMarket.quickServicesList.get(i).isDisplayed()); //Asserts that quick service list Element is displayed
            if (count == 4 ){
                onlineMasterMarket.popularServicesSliderList.get(1).click(); //Drivers moves to the second element of quick services list
            }
            if (count == 8) {
                onlineMasterMarket.popularServicesSliderList.get(2).click(); //Drivers moves to the second element of quick services list
            }
            count++;
        }

    }
    @Then("user tests that clicking on the quick service links on the homepage takes them to the relevant link")
    public void user_tests_that_clicking_on_the_quick_service_links_on_the_homepage_takes_them_to_the_relevant_link() {

        ReusableMethods.bekle(1); //Waits for 1 second
        String elementName;              //Element name created to compare URL

        int count = 1;
        for (int i = 0; i <= onlineMasterMarket.quickServicesList.size(); i++){ //Loop for quick services list
            ReusableMethods.bekle(1); //Waits for 1 second
            elementName = onlineMasterMarket.quickServicesList.get(i).getText(); //i.th element name is assigned to elementName
            onlineMasterMarket.quickServicesList.get(i).click();                 //Driver clicks on the i.th element
            if(count == 4){
                onlineMasterMarket.popularServicesSliderList.get(1).click();    //if count is 4 skip to the next page
            }
            if (count == 8) {
                onlineMasterMarket.popularServicesSliderList.get(2).click();    //if count is 8 skip to the next page
            }
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(elementName)); //Asserts that Driver goes to the relevant link
            count++; //Increases count variable by 1
        }

    }
}