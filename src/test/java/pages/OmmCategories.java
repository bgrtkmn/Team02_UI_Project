package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OmmCategories{

    public OmmCategories(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ


    @FindBy(xpath = "//*[text()='Categories ']") // Header > Categories
    public WebElement HeaderCategories;

    @FindBy(xpath = "(//*[text()='Business Services'])[1]") // Header > Category > BusinessServices
    public WebElement BusinessServices ;

    @FindBy(xpath = "//*[@id='shops-tab']") // Header > Category > Business Services > Shops BUTTON
    public WebElement BusinessServicesShops ;

    @FindBy(xpath = "//*[@id='services-tab']") // Header > Category > Business Services > Service BUTTON
    public WebElement BusinessServicesService ;

    @FindBy(xpath = "//*[@class='shop-wrap']") // Header > Category > Business Services > ilk şirket kartı
    public WebElement BusinessServicesIlkSirket ;

    @FindBy(xpath = "(//*[@class='feather-arrow-right'])[1]") // Header > Category > Business Services > ilk şirket kartındaki visit store ikonu
    public WebElement VisitStoreIcon ;

    @FindBy(xpath = "//a[@href='Home Services'])") // Header > Category > Home Servis >
    public WebElement HomeServis;

    @FindBy(xpath = "//*[@id='shops-tab'])") // Header > Category > Home Servis >
    public WebElement HomeServisShops;

    @FindBy(xpath = "//*[@id='services-tab'])") // Header > Category > Home Servis >
    public WebElement HomeServisService;

    @FindBy(xpath = "//*[@clas='visit-store'])") // Header > Category > Home Servis >
    public WebElement VisitStor;

    @FindBy(xpath = "//*[@id='services-tab'])") // Header > Category > Home Servis >
    public WebElement Servicesbutton;

    @FindBy(xpath = "//*[@class='featute-info'])") // Header > Category > Home Servis >
    public WebElement Amountbilgisi;

    @FindBy(xpath = "//*[@class='fas-fa-map-marker-alt me-2'])") // Header > Category > Home Servis >
    public WebElement Locationsbilgisi;


}
