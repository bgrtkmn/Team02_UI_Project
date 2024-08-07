package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlineMasterMarket;

public class US017_TC003 {
    /*
    Shops butonu ile erişilen sayfada servisler görüntülenir
    Seçiilen serviste 'visit store ' butonu görünür ve aktiftir

     */
    OnlineMasterMarket onlineMasterMarket =new OnlineMasterMarket();

    @When("Moving & transportation'da shops butonuna tıklar")
    public void moving_transportation_da_shops_butonuna_tıklar() {
        onlineMasterMarket.movingAndTransportationShopsButon.click();


    }
    @Then("Moving & transportation'da Shops butonunu altında Shops listesini görüntüler")
    public void moving_transportation_da_shops_butonunu_altında_shops_listesini_görüntüler() {
        onlineMasterMarket.movingAndTransportationShopslist.isDisplayed();

    }

    @When("Moving & transportation shops listesinde bulunan kartta visit store butonunu görüntüler")
    public void moving_transportation_shops_listesinde_bulunan_kartta_visit_store_butonunu_görüntüler() {
        onlineMasterMarket.movingAndTransportationShopslistVisitStoreLink.isDisplayed();

    }
    @When("Moving & transportation shops listesinde bulunan kartta visit store butonunun aktif oldugunu test eder")
    public void moving_transportation_shops_listesinde_bulunan_kartta_visit_store_butonunun_aktif_oldugunu_test_eder() {
        onlineMasterMarket.movingAndTransportationShopslistVisitStoreLink.isEnabled();
    }



}
