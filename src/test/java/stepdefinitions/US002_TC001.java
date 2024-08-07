package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OmmContactUs;
import pages.OmmShops;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;
import utilities.Driver;


public class US002_TC001 {
    /*
    Kullanıcı anasayfaya gider
    Header bölümünde ‘shops ’butonunu görüntüler ve çalıştırır
    Header bölümünde ‘categories’ butonunu görüntüler ve çalıştırır
    Header bölümünde ‘about us’ butonunu görüntüler ve çalıştırır
    Header bölümünde ‘contact us’ butonunu görüntüler ve çalıştırır
    Header bölümünde ‘became a professionel’ butonunu görüntüler ve çalıştırır

     */

    OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
    OmmShops ommShops = new OmmShops();
    //OmmContactUs ommContactUs = new OmmContactUs();




    @Given("Kullanici onlineMasterMarket anasayfasina gider")
    public void kullaniciOnlineMasterMarketAnasayfasınaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));

    }


    @When("Ust barda shops Linkinin görüntülendiğini test eder")
    public void ust_barda_shops_linkinin_görüntülendiğini_test_eder() {
       // ommShops.headerShopsLink.isDisplayed();

    }

    @Then("Shops Linkinin  aktif olduğunu test eder")
    public void shops_linkinin_aktif_olduğunu_test_eder() {
       // ommShops.headerShopsLink.isEnabled();

    }

    @When("Ust barda Categories Linkinin görüntülendiğini test eder")
    public void ust_barda_categories_linkinin_görüntülendiğini_test_eder() {
        //ommCategories.HeaderCategories.isDisplayed();
    }


    @Then("Categories Linkinin aktif olduğunu test eder")
    public void categories_linkinin_aktif_olduğunu_test_eder() {
      // ommCategories.HeaderCategories.isEnabled();

    }


    @When("Ust barda About US Linkinin görüntülendiğini test eder")
    public void ust_barda_about_us_linkinin_görüntülendiğini_test_eder() {
        onlineMasterMarket.headerAboutUSLink.isDisplayed();

    }

    @Then("About US Linkinin aktif olduğunu test eder")
    public void about_us_linkinin_aktif_olduğunu_test_eder() {
        onlineMasterMarket.headerAboutUSLink.isEnabled();

    }
    @When("Ust barda Contact Us Linkinin görüntülendiğini test eder")
    public void ust_barda_contact_us_linkinin_görüntülendiğini_test_eder() {
        //ommContactUs.headerContactUSLink.isDisplayed();
    }
    @Then("Contactus Linkinin aktif olduğunu test eder")
    public void contactus_linkinin_aktif_olduğunu_test_eder(){
       // ommContactUs.headerContactUSLink.isEnabled();

    }
    @When("Ust barda Become a Proffesional Linkinin görüntülendiğini test eder")
    public void ust_barda_become_a_proffesional_linkinin_görüntülendiğini_test_eder() {
        onlineMasterMarket.headerBecomeaProfessionalLink.isDisplayed();
    }
    @Then("Become a Proffesional Linkinin aktif olduğunu test eder")
    public void become_a_proffesional_linkinin_aktif_olduğunu_test_eder() {
        onlineMasterMarket.headerBecomeaProfessionalLink.isEnabled();
    }

    @When("Ust barda Become a User Linkinin görüntülendiğini test eder")
    public void ust_barda_become_a_User_linkinin_görüntülendiğini_test_eder() {
        onlineMasterMarket.headerBecomeaUserlink.isDisplayed();
    }
    @Then("Become a User Linkinin aktif olduğunu test eder")
    public void become_a_User_linkinin_aktif_olduğunu_test_eder() {
        onlineMasterMarket.headerBecomeaUserlink.isEnabled();
    }



    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();


    }

}
