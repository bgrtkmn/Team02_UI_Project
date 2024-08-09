package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlineMasterMarket;

public class US017_TC001 {
    /*
    Kullanıcı ana sayfada moving and transportation kartına tıklar

     */
    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();


    @When("Moving & Transportation kartının görüntülendigini test eder")
    public void moving_transportation_kartının_görüntülendigini_test_eder() {
        onlineMasterMarket.homePageMovingTransportationCard.isDisplayed();


    }

    @Then("Moving & transportation kartının aktif oldugunu test eder")
    public void moving_transportation_kartının_aktif_oldugunu_test_eder() {
        onlineMasterMarket.homePageMovingTransportationCard.isEnabled();


    }
}
