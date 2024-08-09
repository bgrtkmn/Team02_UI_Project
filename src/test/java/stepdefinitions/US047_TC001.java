package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;

import static utilities.ReusableMethods.typeKeys;

public class US047_TC001 {
    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();

    @Then("Kayıtlı kullanıcı  e-posta adresini girer ve enter tuşuna basar")
    public void kayıtlı_kullanıcı_e_posta_adresini_girer_ve_enter_tuşuna_basar() {
      //  onlineMasterMarket.emailBox.sendKeys(ConfigReader.getProperty("ommEmail"));
        typeKeys("aysevarli.user@ommarket.com", onlineMasterMarket.emailBox);



    }
    @Then("Kayıtlı kullanici gecerli parolayı girer ve enter tuşuna basar")
    public void kayıtlı_kullanici_gecerli_parolayı_girer_ve_enter_tuşuna_basar() {
        onlineMasterMarket.emailBox.sendKeys("Ommarket.2607");
        onlineMasterMarket.emailLoginButton.submit();

    }

    @And("Enter")
    public void enter() {
        onlineMasterMarket.emailLoginButton.submit();
    }
}
