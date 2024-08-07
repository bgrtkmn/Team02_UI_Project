package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OmmServicePage {
    public OmmServicePage(){ PageFactory.initElements(Driver.getDriver(),this );}



    @FindBy(xpath = "//*[@class='label-amount']") // Herhangi bir service sayfasındaki amount başlığı.
    public WebElement ServiceAmount ;

    @FindBy(xpath = "//*[@class='card provider-widget clearfix']") // Herhangi bir service sayfasındaki Service Provider Kartı.
    public WebElement ServiceProvider ;

    @FindBy(xpath = "//*[@class='card available-widget']") // Herhangi bir service sayfasındaki ServiceAvailability Kartı.
    public WebElement ServiceAvailability ;

    @FindBy(xpath = "(//*[@class='service-card'])[1]") // Herhangi bir service sayfasındaki ServiceDetails Kartı.
    public WebElement ServiceDetails ;

    @FindBy(xpath = "(//*[@class='service-card'])[2]") // Herhangi bir service sayfasındaki Additional Services Kartı.
    public WebElement AdditionalServices ;

    @FindBy(xpath = "(//*[@class='service-card'])[3]") // Herhangi bir service sayfasındaki Reviews Kartı.
    public WebElement Reviews ;

    @FindBy(xpath = "//*[@class='card-title service-related']") // Herhangi bir service sayfasındaki RelatedServices başlığı.
    public WebElement RelatedServices ;







}
