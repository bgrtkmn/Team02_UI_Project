package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OmmHomepage;

public class US015_TC002 {
OmmHomepage ommHomepage =new OmmHomepage();
    @When("shops ikonuna tiklanir")
    public void shops_ikonuna_tiklanir() {

        ommHomepage.Shops.click();

    }
    @When("visit store ikonu goruntulenir ve tiklanir")
    public void visit_store_ikonu_goruntulenir_ve_tiklanir() {


        ommHomepage.VisitStoreIkonu.click();
    }
    @When("servisler goruntulenir")
    public void servisler_goruntulenir() {
        Assert.assertTrue(ommHomepage.VitalBalanceVisitStore.isDisplayed());
    }
    @When("genel bilgiler goruntulenir")
    public void genel_bilgiler_goruntulenir() {
        Assert.assertTrue(ommHomepage.shopDetails.isDisplayed());
    }
}
