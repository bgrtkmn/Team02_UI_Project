package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OmmHomepage;
import utilities.Driver;

public class US024_TC002 {


    OmmHomepage ommHomepage = new OmmHomepage();

    @Given("Ziyaretçi body bölümünde bulunan Most Popular Services başlığının altındaki View All ikonunu görüntüler ve tıklayıp ilgili sayfaya ulaşır.")
    public void ziyaretçi_body_bölümünde_bulunan_most_popular_services_başlığının_altındaki_view_all_ikonunu_görüntüler_ve_tıklayıp_ilgili_sayfaya_ulaşır() throws InterruptedException {

    ommHomepage.BodyMostPopularViewAllButton.click();

    String ExpectedUrl = "https://qa.onlinemastermarket.com/all-services";
    String ActualUrl = Driver.driver.getCurrentUrl();

    Assert.assertEquals(ExpectedUrl,ActualUrl);


    }
}
