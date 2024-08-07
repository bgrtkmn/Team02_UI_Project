package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.OmmHomepage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.driver;

public class US030_TC001 {
    OmmHomepage ommHomepage = new OmmHomepage();
    Actions actions = new Actions(driver);

    @Given("categories, quick links, contact us, social links goruntuler")
    public void categories_quick_links_contact_us_social_links_goruntuler() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Beklenen element sayısı
        int expectedElementCount = 4;

        // Element sayısının doğru olup olmadığını kontrol et
        assertEquals("Element listesi beklenen uzunlukta değil", expectedElementCount, ommHomepage.footerBlm.size());


    }

    @Given("Sitenin adres,mail ve telefon bilgileri görüntuleni")
    public void sitenin_adres_mail_ve_telefon_bilgileri_görüntuleni() {

        Assert.assertTrue(ommHomepage.contactUs.isDisplayed());
    }

    @Given("Footerdaki Privacy Terms ve Conditions linki goruntulenir")
    public void footerdaki_privacy_terms_ve_conditions_linki_goruntulenir() {

        Assert.assertTrue(ommHomepage.privacyAndConditonsAndTerms.isDisplayed());
    }

    @Given("Sosyal medya ikonlari goruntulenir")
    public void sosyal_medya_ikonlari_goruntulenir() {

        Assert.assertTrue(ommHomepage.socialMediaIkn.isDisplayed());
    }
}
