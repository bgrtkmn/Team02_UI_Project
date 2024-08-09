package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OmmShops;

import static utilities.Driver.driver;

public class US014_TC005 {


    OmmShops OmmShops = new OmmShops();
    @Given("Kullanici services ve Shop butonuna tıklar ve search form'da 'Search' butonu gorunur ve aktif oldugunu görüntüler.")
    public void kullanici_services_ve_Shop_butonuna_tıklar_ve_search_formda_search_butonu_gorunur_ve_aktif_oldugunu_görüntüler() {
        OmmShops.SearchButton.click();
        OmmShops.SearchButton.isDisplayed();
        driver.quit();
}


}
