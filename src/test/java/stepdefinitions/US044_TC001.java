package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OmmHomepage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.typeKeys;

public class US044_TC001 {

    /*
     * Ziyaretçi URL’e gider.
     * Ziyaretci Login butonunu tiklar
     * Ziyaretci e mail id i girilir
     * Ziyaretci password girilir
     * Ziyaretçi Profil ikonuna tıklandıgında Logout ikonu görünür ve aktif oldugunu test eder.
     * Ziyretci logout linkine tiklar
     * Ziyaretçi Logout linkine tıklandıginda basarili bir sekilde cikis yapilabildigini test eder.
     */

    OmmHomepage ommHomepage = new OmmHomepage();

    @Given("Ziyaretçi URL’e gider.")
    public void ziyaretci_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
    }

    @Given("login butonuna tiklanir")
    public void login_butonuna_tiklanir() {
        ommHomepage.loginBtn.click();
    }

    @Given("e mail id i girilir")
    public void e_mail_id_i_girilir() {
        typeKeys("serifeyigit.user@ommarket.com", ommHomepage.loginId);
        ommHomepage.enterBtn.click();
    }

    @Given("password girilir")
    public void password_girilir() {
        ommHomepage.password.sendKeys("Ommarket.2607");
        ommHomepage.enterBtnPassword.click();
    }

    @Given("profil ikonuna tiklanir")
    public void profil_ikonuna_tiklanir() {
        ommHomepage.profilIkn.click();
    }

    @Given("logout linkine tiklanir")
    public void logout_linkine_tiklanir() {

        ommHomepage.logoutBtn.click();
        ommHomepage.logoutBtn.isDisplayed();

    }


}
