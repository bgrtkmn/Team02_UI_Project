package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlineMasterMarket;

public class US017_TC002 {
    /*
    Moving& Transportation’da ‘shops’ butonunu görüntüler ve aktif olduğunu görür
    Moving& Transportation’da ‘Services’ butonuna görüntüler ve aktif olduğunu görür
     */
    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();


    @Then("Moving & transportation kartına tıklar")
    public void moving_transportation_kartına_tıklar() {
        onlineMasterMarket.homePageMovingTransportationCard.click();


    }

    @When("Moving & transportation'da Shops butonunu görüntüler")
    public void moving_transportation_da_shops_butonunu_görüntüler() {
        onlineMasterMarket.movingAndTransportationShopsButon.isDisplayed();
    }
    @Then("Moving & transportation'da Shops butonunun aktif oldugunu test eder")
    public void moving_transportation_da_shops_butonunun_aktif_oldugunu_test_eder() {
        onlineMasterMarket.movingAndTransportationShopsButon.isEnabled();

    }
    @Then("Moving & transportation'da Service butonunu görüntüler")
    public void moving_transportation_da_service_butonunu_görüntüler() {
        onlineMasterMarket.movingAndTransportationServiceButon.isDisplayed();

    }
    @Then("Moving & transportation'da Service butonunun aktif oldugunu test eder")
    public void moving_transportation_da_service_butonunun_aktif_oldugunu_test_eder() {
        onlineMasterMarket.movingAndTransportationServiceButon.isEnabled();
    }

}
