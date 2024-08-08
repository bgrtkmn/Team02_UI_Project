package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


    @FindBy(xpath = "/html/body/div[1]/footer/div[1]/div/div/div")
    public List<WebElement> footerBlm;


    @FindBy(xpath = "/html/body/div[1]/footer/div[1]/div/div/div[3]/div/div")
    public WebElement contactUs;


    @FindBy(xpath = "/html/body/div[1]/footer/div[2]/div/div/div/div[2]/div/ul")
    public WebElement privacyAndConditonsAndTerms;

    @FindBy(xpath = "/html/body/div[1]/footer/div[1]/div/div/div[4]/div/div/div/div/ul")
    public WebElement socialMediaIkn;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li/a")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"login_email\"]")
    public WebElement loginId;

    @FindBy(xpath = "//*[@id=\"login_password\"]")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/a/span/img")
    public WebElement profilIkn;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/div/a[8]")
    public WebElement logoutBtn;


    @FindBy(xpath = "//*[@id=\"emaillogin_submit\"]")
    public WebElement enterBtn;

    @FindBy(xpath = "//*[@id=\"emailregistration_finals\"]")
    public WebElement enterBtnPassword;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/div/a[1]")
    public WebElement profilDashboard;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[2]/ul/li[5]/a")
    public WebElement providerDashboardOrderList;

    @FindBy(xpath = "//*[@id=\"select2-delivery_status-container\"]")
    public WebElement OrderListFiltreleme;

    @FindBy(xpath = "//*[@id=\"ol_103\"]/div/div[2]/a[1]")
    public WebElement acceptOrder;

    @FindBy(xpath = "//*[@id=\"ol_103\"]/div/div[2]/a[1]")
    public WebElement cancelOrder;

    @FindBy(xpath = "//*[@id=\"ol_101\"]/div/div[2]/a[2]")
    public WebElement changeToShipping;

    @FindBy(xpath = "//*[@id=\"ol_101\"]/div/div[2]/a[3]")
    public WebElement outOfDelivery;

    @FindBy(xpath = "//*[@id=\"ol_101\"]/div/div[2]/a[4]")
    public WebElement delivered;

    @FindBy(xpath = "//*[@id=\"order_cancel_pop\"]/div/div/div[3]/button[1]")
    public WebElement cancelYes;

    @FindBy(xpath = "//*[@id=\"cancel_reason\"]")
    public WebElement cancelReason;


    @FindBy(xpath = "(//*[@class=\"title-set\"])[2]")
    public WebElement BodyMostPopularServices;



    @FindBy(xpath = "(//*[text()=\"Full-Service Catering (per person)\"])[1]") // Body > Popular Services > Full Service Catering text başlık
    public WebElement BodyMostPopularServicesIlkSirketTextBaslik;


    @FindBy(xpath = "(//*[@class=\"btn btn-viewall\"])[2]") // Body MostPopular Services  View All butonu
    public WebElement BodyMostPopularViewAllButton;



}

