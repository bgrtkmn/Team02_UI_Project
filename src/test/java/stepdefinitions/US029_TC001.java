package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePagee;
import pages.OnlineMasterMarket;
import utilities.ConfigReader;
import utilities.Driver;

public class US029_TC001 {

        OnlineMasterMarket onlineMasterMarket = new OnlineMasterMarket();
        Actions actions = new Actions(Driver.getDriver());
        HomePagee Homepagee = new HomePagee();
    @Given("Ziyaretçi URL’e gider.")
    public void ziyaretci_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("ommURL"));
}
    @Then("How It Works başlığı görünür olmalıdır")
    public void how_it_works_basligi_gorunur_olmalidir() {
        Homepagee.HowItWork.isDisplayed();
        Homepagee.HowItWork.click();


    }
    @Then("başlık altındaki slaytta açıklamalar görünür olmalıdır")
    public void baslik_altindaki_slaytta_aciklamalar_gorunur_olmalidir() {
        // Başlık altındaki slaytta açıklamaların görünür olup olmadığını kontrol edin
        Homepagee.HowItWorkAciklamaikon.isDisplayed();
        Homepagee.HowItWorkAciklamaikon.click();

    }

}
//[<h2> Enter Your Request </h2>]         1
//*[<h2>Browse Offers</h2>]               2
// [<h2>Make Your Selection</h2>	]     3
//<h2>Complete the Service</h2>           4