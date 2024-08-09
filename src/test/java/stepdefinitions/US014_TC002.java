package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmShops;
import utilities.Driver;

public class US014_TC002 {
    OmmShops ommShops = new OmmShops();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici Açılan şirketin sayfasında Shop Details, Shop Availability, Services Görüntüler.")
    public void kullanici_acılan_sirketin_sayfasında_shop_details_shop_availability_services_görüntüler() {
        ommShops.ShopDetails.isDisplayed();
        ommShops.ShopAvailability.isDisplayed();
        ommShops.ShopServices.isDisplayed();
    }
    @Given("Kullanici şirketin sayfasında services butonuna tıklar ve hizmetleri görüntüler.")
    public void kullanici_sirketin_sayfasında_services_butonuna_tıklar_ve_hizmetleri_görüntüler() {
        ommShops.ShopServicesButton.click();
        ommShops.ShopServiceCard.isDisplayed();

    }
    @Given("Kullanici şirketin sayfasındaki hizmet kartlarında hizmeti veren şirketin ismi, amount bilgisi, Location'ı görüntüler.")
    public void kullanici_sirketin_sayfasındaki_hizmet_kartlarında_hizmeti_veren_sirketin_ismi_amount_bilgisi_location_ı_görüntüler() {
        ommShops.ShopServiceSirketIsmi.isDisplayed();
        ommShops.ShopServiceAmount.isDisplayed();
        ommShops.ShopServiceLocation.isDisplayed();
    }

}