package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmCategories;
import utilities.ConfigReader;
import utilities.Driver;

public class US009_TC001 {

    OmmCategories ommCategories = new OmmCategories();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Ziyaretçi URL’e gider.")
    public void ziyaretçi_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));

    }
    @Given("Ziyaretçi Header bölümünden Categories altındaki Business Service’i görüntüler ve tıklar.")
    public void ziyaretçi_header_bölümünden_categories_altındaki_business_service_i_görüntüler_ve_tıklar() throws InterruptedException {
        actions.moveToElement(ommCategories.HeaderCategories).perform();
        ommCategories.BusinessServices.isDisplayed();
        ommCategories.BusinessServices.click();

    }
    @Given("Ziyaretçi Shops ve Service butonlarını görüntüler ve service butonuna tıklar.")
    public void ziyaretçi_shops_ve_service_butonlarını_görüntüler_ve_service_butonuna_tıklar() throws InterruptedException {
        ommCategories.BusinessServicesShops.isDisplayed();
        ommCategories.BusinessServicesService.isDisplayed();
        ommCategories.BusinessServicesService.click();

    }
    @Given("Ziyaretçi Shops butonuna tıklar ve ilgili şirketleri görüntüler.")
    public void ziyaretçi_shops_butonuna_tıklar_ve_ilgili_şirketleri_görüntüler() {
        ommCategories.BusinessServicesShops.click();
        ommCategories.BusinessServicesIlkSirket.isDisplayed();

    }
    @Given("Ziyaretçi herhangi bir şirket kartındaki Visit Store ikonunu görüntüler ve tıklar.")
    public void ziyaretçi_herhangi_bir_şirket_kartındaki_visit_store_ikonunu_görüntüler_ve_tıklar() {
        ommCategories.VisitStoreIcon.isDisplayed();
        ommCategories.VisitStoreIcon.click();

    }

}
