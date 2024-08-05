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
    Actions actions = new Actions(Driver.getDriver());

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        //No code required in this field.
    }

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
        //Driver visits desired webpage

    }
    @Given("user tests that the search engine is visible")
    public void user_tests_that_the_search_engine_is_visible() {

        actions.scrollToElement(onlineMasterMarket.searchBar);
        Assert.assertTrue(onlineMasterMarket.searchBar.isDisplayed());
        //Driver tests that main page has search bar and visible

    }
    @Given("user tests that the quick service links on the homepage are visible")
    public void user_tests_that_the_quick_service_links_on_the_homepage_are_visible() {

        int count = 1;
        for (int i = 0; i < onlineMasterMarket.quickServicesList.size(); i++) {

            Assert.assertTrue(onlineMasterMarket.quickServicesList.get(i).isDisplayed());

            if (count == 4 || count == 8){
                //.click();
            }
            count++;

        }
        //Tamamlanmadı slider menüde sağdaki elemente geceilmek icin birseyler yapmak gerekebilir



    }
    @Then("user tests that clicking on the quick service links on the homepage takes them to the relevant link")
    public void user_tests_that_clicking_on_the_quick_service_links_on_the_homepage_takes_them_to_the_relevant_link() {

        String currentPage;

        for (int i = 0; i < onlineMasterMarket.quickServicesList.size(); i++){

            currentPage = onlineMasterMarket.quickServicesList.get(i).getText();
            onlineMasterMarket.quickServicesList.get(i).click();
            //Assert.assertEquals(Driver.getDriver().getCurrentUrl().contains(currentPage));

        }

        //Tamamlanmadı slider menüde sağdaki elemente geceilmek icin birseyler yapmak gerekebilir

    }


}