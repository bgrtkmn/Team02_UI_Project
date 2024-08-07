package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.OmmHomepage;

import static utilities.ReusableMethods.bekle;

public class US045_TC001 {

    OmmHomepage ommHomepage = new OmmHomepage();

    @Given("login butonuna tiklanir")
    public void login_butonuna_tiklanir() {
        ommHomepage.loginBtn.click();
    }

    @Given("e mail id i girilir")
    public void e_mail_id_i_girilir() {
        ommHomepage.loginId.sendKeys("mrasitcelik.user@ommarket.com");
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
    }

}
