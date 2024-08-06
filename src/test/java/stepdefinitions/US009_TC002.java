package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmCategories;
import pages.OmmShops;
import utilities.Driver;

public class US009_TC002 {


    OmmShops ommShops = new OmmShops();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Ziyaretçi Açılan şirketin sayfasında Shop Details, Shop Availability, Services Görüntüler.")
    public void ziyaretçi_açılan_şirketin_sayfasında_shop_details_shop_availability_services_görüntüler() {
        ommShops.ShopDetails.isDisplayed();
        ommShops.ShopAvailability.isDisplayed();
        ommShops.ShopServices.isDisplayed();

    }
    @Given("Ziyaretçi şirketin sayfasında services butonuna tıklar ve hizmetleri görüntüler.")
    public void ziyaretçi_şirketin_sayfasında_services_butonuna_tıklar_ve_hizmetleri_görüntüler() {
        ommShops.ShopServicesButton.click();
        ommShops.ShopServiceCard.isDisplayed();

    }
    @Given("Ziyaretçi şirketin sayfasındaki hizmet kartlarında hizmeti veren şirketin ismi, amount bilgisi, Location'ı görüntüler.")
    public void ziyaretçi_şirketin_sayfasındaki_hizmet_kartlarında_hizmeti_veren_şirketin_ismi_amount_bilgisi_location_ı_görüntüler() {
        ommShops.ShopServiceSirketIsmi.isDisplayed();
        ommShops.ShopServiceAmount.isDisplayed();
        ommShops.ShopServiceLocation.isDisplayed();
    }
    @Given("Ziyaretçi şirketin sayfasındaki hizmet kartlarından herhangi birine tıklar ve ilgili ulaşır.")
    public void ziyaretçi_şirketin_sayfasındaki_hizmet_kartlarından_herhangi_birine_tıklar_ve_ilgili_ulaşır() {
        actions.scrollToElement(ommShops.ShopServices).perform();
        ommShops.ShopServiceilkSirketPhoto.click();

    }

}
