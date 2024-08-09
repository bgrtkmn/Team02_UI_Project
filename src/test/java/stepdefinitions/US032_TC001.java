package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.OmmHomepage;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.lang.module.Configuration;

import static utilities.ReusableMethods.typeKeys;


public class US032_TC001 {

    OmmHomepage ommHomepage =  new OmmHomepage();


    @Then("Ust barda login butonuna tıklar")
    public void ust_barda_login_butonuna_tıklar() {
        ommHomepage.loginBtn.click();
    }
    @Then("Kullanici kayıtlı e-posta adresini girer ve enter tuşuna basar")
    public void kullanici_kayıtlı_e_posta_adresini_girer_ve_enter_tuşuna_basar() {
       // String emailProvider = "info@team2.com";
        // onlineMasterMarket.emailBox.sendKeys(emailProvider);
       // typeKeys("aysevarli.user@ommarket.com", ommHomepage.loginId);
        ommHomepage.loginId.sendKeys(ConfigReader.getProperty("ommStaffEmail"));
        ReusableMethods.bekle(1);
     //   ommHomepage.loginId.sendKeys(" ");
        //ReusableMethods.bekle(3);

        ommHomepage.enterBtn.click();
    }



    @Then("Kullanici gecerli parolayı girer ve enter tuşuna basar")
    public void kullanici_gecerli_parolayı_girer_ve_enter_tuşuna_basar() {
        //typeKeys("Ommarket.2607", ommHomepage.password);
       ommHomepage.password.click();
       ommHomepage.password.sendKeys("Ommarket.2607");
        ommHomepage.paswordEnter.click();
    }


    @Then("Ust barda profil ikonunun görüntülendiğini test eder")
    public void ust_barda_profil_ikonunun_görüntülendiğini_test_eder() {
       ommHomepage.profilIkn.isDisplayed();
    }
    @Then("Ust barda profil ikonunun aktif oldugunu test eder")
    public void ust_barda_profil_ikonunun_aktif_oldugunu_test_eder() {
        ommHomepage.profilIkn.isEnabled();

    }

    @Then("{int} saniye bekler")
    public void saniyeBekler(int arg0) {
        ReusableMethods.bekle(arg0);
    }
}
