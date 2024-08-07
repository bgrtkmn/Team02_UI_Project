package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmServicePage;
import pages.OmmShops;
import utilities.Driver;

public class US009_TC003 {


    OmmServicePage ommServicePage = new OmmServicePage();
    Actions actions = new Actions(Driver.getDriver());



    @Given("Ziyaretçi hizmet sayfasındaki Amount bilgisi, Service Provider, Service Availability, Service Details, Additional Services, Reviews, Related Services bölümlerini görüntüler.")
    public void ziyaretçi_hizmet_sayfasındaki_amount_bilgisi_service_provider_service_availability_service_details_additional_services_reviews_related_services_bölümlerini_görüntüler() {
        ommServicePage.ServiceAmount.isDisplayed();
        ommServicePage.ServiceProvider.isDisplayed();
        ommServicePage.ServiceAvailability.isDisplayed();
        ommServicePage.ServiceDetails.isDisplayed();
        ommServicePage.AdditionalServices.isDisplayed();
        ommServicePage.Reviews.isDisplayed();
        ommServicePage.RelatedServices.isDisplayed();

    }
}
