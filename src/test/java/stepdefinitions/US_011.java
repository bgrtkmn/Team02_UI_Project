package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePagee;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011 {

    HomePagee homePage = new HomePagee();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici {string} gider")
    public void kullanici_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @When("kullanici anasayfayi goruntuler.")
    public void kullanici_anasayfayi_goruntuler() {
        Assert.assertTrue(homePage.homePageLogo.isDisplayed());

    }
    @Given("Kullanici header bolumundeki categories'in ustune gelir")
    public void kullanici_header_bolumundeki_categories_in_ustune_gelir() {
        actions.moveToElement(homePage.homePageCategories).perform();;


    }
    @When("Kullanici Categories'in altinda yer alan Moving & Transportation'a tiklar.")
    public void kullanici_categories_in_altinda_yer_alan_moving_transportation_a_tiklar() {
        homePage.movingAndTransportation.click();

    }
    @Then("İlgili ekranda Shop ve Service'i goruntuler")
    public void ilgili_ekranda_shop_ve_service_i_goruntuler() {

        Assert.assertTrue(homePage.shopsLogo.isDisplayed());
        Assert.assertTrue(homePage.servicesLogo.isDisplayed());

    }

    @When("Kullanici Shops'a tiklar")
    public void kullaniciShopsATiklar() {
        homePage.shopsLogo.click();

    }


    @Then("Kullanici Visit Store'a goruntuler")
    public void kullaniciVisitStoreATıklayabilmeli() {

        Assert.assertTrue(homePage.visitStore.isDisplayed());
    }

    @When("Kullanici Visit Store'a tiklar")
    public void kullaniciVisitStoreATiklar() {
        homePage.visitStore.click();
    }

    @Then("Kullanici sirket bilgilerini goruntuler")
    public void kullaniciSirketBilgileriniGoruntuler() {
        Assert.assertTrue(homePage.horizonMoversInfo.isDisplayed());
    }

    @When("Kullanici Local Moving hizmetini secer")
    public void kullaniciLocalMovingHizmetiniSecer() {
        actions.moveToElement(homePage.localMoving).perform();
        homePage.localMoving.click();
    }

    @Then("Kullanici Service Provider, Service Availability, Service Details, Additional Services, Reviews ve Related Services alanlarini goruntuler")
    public void kullaniciServiceProviderServiceAvailabilityServiceDetailsAdditionalServicesReviewsVeRelatedServicesAlanlariniGoruntuler() {
        Assert.assertTrue(homePage.serviceDetailsInfo.isDisplayed());
        Assert.assertTrue(homePage.serviceProvideInfo.isDisplayed());
        Assert.assertTrue(homePage.additionalServicesInfo.isDisplayed());
        Assert.assertTrue(homePage.serviceDetailsInfo.isDisplayed());
        Assert.assertTrue(homePage.relatedServicesInfo.isDisplayed());
        Assert.assertTrue(homePage.reviewsInfo.isDisplayed());

    }

    @When("Kullanici Filter iconuna tiklar")
    public void kullaniciFilterIconunaTiklar() {
        homePage.filterIcon.click();

    }

    @When("Kullanici Filter bilgilerini goruntuler")
    public void kullaniciFilterBilgileriniGoruntuler() {
        Assert.assertTrue(homePage.locationFilter.isDisplayed());
        Assert.assertTrue(homePage.categoriesInfo.isDisplayed());


        
    }

    @When("Kullanici Services'e tiklar")
    public void kullaniciServiesSTiklar() {
        homePage.servicesLogo.click();
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        ReusableMethods.bekle(beklemeSuresi);
    }

    @When("Kullanici Categories bolumune tiklar ve Home Services'i secer.")
    public void kullaniciCategoriesBolumuneTiklarVeHomeServicesISecer() {
        homePage.filterCategories.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }

    @When("Kullanici Sub Category'i Cleaning olarak secer.")
    public void kullaniciSubCategoryICleaningOlarakSecer() {

        homePage.filterSubCategory.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @When("Kullanici Search butonuna tiklar.")
    public void kullaniciSearchButonunaTiklar() {
        homePage.searchButton.click();
    }

    @Then("Kullanici sayfada Full House Cleaning'i gorntuler.")
    public void kullaniciSayfadaFullHouseCleaningIGorntuler() {
        Assert.assertTrue(homePage.fullHouseCleaning.isDisplayed());
    }

    @Given("Kullanici header bolumundeki Shop'un ustune gelir")
    public void kullaniciHeaderBolumundekiShopUnUstuneGelir() {

        homePage.homePageShops.click();
    }

    @Then("Kullanici Moving & Transportationu goruntuler")
    public void kullaniciMovingTransportationuGoruntuler() {
        Assert.assertTrue(homePage.movingAndTransportation.isDisplayed());
    }

    @When("Kullanici Categories bolumune tiklar ve Personel Services'i secer.")
    public void kullaniciCategoriesBolumuneTiklarVePersonelServicesISecer() {
        homePage.filterCategories.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @When("Kullanici Sub Category'i Beauty olarak secer.")
    public void kullaniciSubCategoryIBeautyOlarakSecer() {
        homePage.filterSubCategory.click();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("Kullanici sayfada HairCut'i goruntuler")
    public void kullaniciSayfadaHairCutIGoruntuler() {
        Assert.assertTrue(homePage.hairCutServices.isDisplayed());
    }
}
