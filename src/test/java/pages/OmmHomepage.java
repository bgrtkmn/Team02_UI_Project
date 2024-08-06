package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OmmHomepage {
    public OmmHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ

    @FindBy(xpath = "//*[@id=\"category-slider\"]/div[1]/div/div[2]/div/div/div[2]/a/span")
    public WebElement PersonelServices;

    // Homepage sayfasında bulunan personel services

    @FindBy(id = "filter_search")
    public WebElement FilterSearchbtn;

    // Personel services sayfasında bulunan hamburger menü

    @FindBy(xpath = "//*[@id=\"dataList\"]/div[6]/div/div[2]/h4/a")
    public WebElement Services;


    // Personel services sayfasında bulunan hair style servisinin locate i

    @FindBy(xpath = "//*[@id=\"shops-tab\"]")
    public WebElement Shops;


    @FindBy(xpath = "//*[@id=\"dataListShop\"]/div[1]/div/div/div[4]")
    public WebElement VisitStoreIkonu;

    @FindBy(xpath = "//*[@id=\"services_lists\"]/div")
    public WebElement VitalBalanceVisitStore;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div[1]/div[1]")
    public WebElement shopDetails;


}

