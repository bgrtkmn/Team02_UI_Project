package pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]/ul/li[2]/a") // Header -> Categories -> Repairs&Maintenance
    public static WebElement categoriesRepairAndMaintenance;

}