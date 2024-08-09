package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.OnlineMasterMarket;

public class US017_TC004 {
    /*
    Seçilen servis sayfasında ‘shop details’ kartını görüntüler
     Seçilen servis sayfasında ‘shop availability’ kartını görüntüler

     */
    OnlineMasterMarket onlineMasterMarket =new OnlineMasterMarket();
    @Then("Moving & transportation'da Shops butonunu altında Shops listesinden ilkini secer")
    public void moving_transportation_da_shops_butonunu_altında_shops_listesinden_ilkini_secer() {
        onlineMasterMarket.movingAndTransportationIlkShop.isDisplayed();
    }

    @Then("Moving & transportation shops listesinde bulunan kartta visit store butonuna tıklar")
    public void moving_transportation_shops_listesinde_bulunan_kartta_visit_store_butonuna_tıklar() {
        onlineMasterMarket.movingAndTransportationShopslistVisitStoreLink.click();

    }
    @Then("Seçili serviste shops detail bölümünü görüntülenir")
    public void seçili_serviste_shops_detail_bölümünü_görüntülenir() {
      onlineMasterMarket.shopsDetail.isDisplayed();
    }
    @Then("Seçili serviste shop avaibility bölümünü görüntüler")
    public void seçili_serviste_shop_avaibility_bölümünü_görüntüler() {
        onlineMasterMarket.shopAvaibility.isDisplayed();
    }

    @Then("Seçili serviste servis listesini görüntüler")
    public void seçili_serviste_servis_listesini_görüntüler() {
        onlineMasterMarket.servicesList.isDisplayed();
    }


}
