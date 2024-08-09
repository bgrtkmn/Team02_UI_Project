package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmServicePage;
import pages.OmmShops;
import utilities.Driver;

public class US014_TC003 {

    OmmServicePage ommServicePage = new OmmServicePage();
    OmmShops OmmShops = new OmmShops();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici sirketin sayfasındaki hizmet kartlarından birine tıklar.")
    public void kullanici_sirketin_sayfasındaki_hizmet_kartlarından_herhangi_birine_tıklar_ve_ilgili_ulaşır() {
        actions.scrollToElement(OmmShops.ShopServices).perform();
        //OmmShops.ShopServiceilkSirketPhoto.click();
    }

    @Given("Kullanici hizmet sayfasındaki Amount bilgisi, Service Provider, Service Availability, Service Details, Additional Services, Reviews, Related Services bölümlerini görüntüler.")
    public void Kullanici_hizmet_sayfasındaki_amount_bilgisi_service_provider_service_availability_service_details_additional_services_reviews_related_services_bölümlerini_görüntüler() {
        ommServicePage.ServiceAmount.isDisplayed();
        ommServicePage.ServiceProvider.isDisplayed();
        ommServicePage.ServiceAvailability.isDisplayed();
        ommServicePage.ServiceDetails.isDisplayed();
        ommServicePage.AdditionalServices.isDisplayed();
        ommServicePage.Reviews.isDisplayed();
        ommServicePage.RelatedServices.isDisplayed();
    }
}
