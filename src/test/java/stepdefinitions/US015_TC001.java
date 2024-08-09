package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.OmmHomepage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US015_TC001 {
    OmmHomepage ommHomepage =new OmmHomepage();

    Actions actions = new Actions(driver);



    @Given("adresine gider")
    public void adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));



    }
    @Then("personel services basligi gorunur")
    public void personel_services_basligi_gorunur() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(ommHomepage.PersonelServices.isDisplayed());
    }
    @When("Personel sevices e tiklanir")
    public void personel_sevices_e_tiklanir() {
        ommHomepage.PersonelServices.click();
    }
    @When("filtreleme ikonu goruntulenir")
    public void filtreleme_ikonu_goruntulenir() {

        Assert.assertTrue(ommHomepage.FilterSearchbtn.isDisplayed());
    }

    @And("personel servisler goruntulenir")
    public void personelServislerGoruntulenir() {

        Assert.assertTrue(ommHomepage.Services.isDisplayed());
    }
}
