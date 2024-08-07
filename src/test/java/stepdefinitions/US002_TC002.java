package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlineMasterMarket;

public class US002_TC002 {
    /*
    Kullanıcının header’da login butonunu görüntülemesi ve çalıştırması testi
    */
    OnlineMasterMarket onlineMasterMarket =new OnlineMasterMarket();


    @When("Ust barda login Linkinin görüntülendiğini test eder")
    public void ust_barda_login_linkinin_görüntülendiğini_test_eder() {
        onlineMasterMarket.mainPageLoginButton.isDisplayed();
    }
    @Then("Login Linkinin aktif olduğunu test eder")
    public void login_linkinin_aktif_olduğunu_test_eder() {
        onlineMasterMarket.mainPageLoginButton.isEnabled();
    }

}
