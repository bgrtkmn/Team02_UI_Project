package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmCategories;
import utilities.ConfigReader;
import utilities.Driver;

public class US014_TC001 {

    OmmCategories ommCategories = new OmmCategories();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici URL’e gider.")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
    }

    @Given("Kullanici Header bölümünden Categories altındaki Home Service’i görüntüler ve tıklar.")
    public void kullanici_Header_bölümünden_categories_altındaki_Home_service_i_görüntüler_ve_tıklar() throws InterruptedException {
        ommCategories.HomeServis.isDisplayed();
        ommCategories.HomeServis.click();
    }

    @Given("Kullanici Shops ve Service butonlarını görüntüler ve service butonuna tıklar.")
    public void kullanici_shops_ve_service_butonlarini_görüntüler_ve_service_butonuna_tiklar() throws InterruptedException {
        ommCategories.HomeServisService.isDisplayed();
        ommCategories.HomeServisShops.isDisplayed();
        ommCategories.HomeServisService.click();
    }
    @Given("Kullanici Shops butonuna tıklar ve ilgili şirketleri görüntüler.")
    public void kullanicii_shops_butonuna_tiklar_ve_ilgili_sirketleri_görüntüler() {
        ommCategories.HomeServisShops.click();
        //
    }

        @Given("Kullanici herhangi bir şirket kartındaki Visit Store ikonunu görüntüler ve tıklar.")
        public void kullanici_herhangi_bir_sirket_kartindaki_visit_store_ikonunu_görüntüler_ve_tiklar() {
            ommCategories.VisitStor.isDisplayed();
            ommCategories.VisitStor.click();

        }

}