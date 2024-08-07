package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OnlineMasterMarket {

    public OnlineMasterMarket(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ




    @FindBy(xpath = "//a[@class='btn btn-signin']")  //Anasayfadaki Login Butonu
    public WebElement mainPageLoginButton;

    @FindBy(xpath = "//input[@class='form-control login_email']") // Login Butonuna tıklantıktan sonraki email kutusu
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id='emaillogin_submit']") // Emaili onaylamak icin
    public WebElement emailLoginButton;

    @FindBy(xpath = "//*[@id='login_password']") // Email icin password kutusu
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='emaillogin_submit']") // Email ve password'u onaylamak icin enter butonu
    public WebElement enterButton;

    @FindBy(xpath = "//*[@id='search-blk']")
    public WebElement searchBar;

    @FindBy(xpath = "//*[@ ='//section[4]//div/div[2]/h4/a']")
    public List<WebElement> quickServicesList;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]")
    public WebElement headerMenuCategories;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]/ul/li[2]/a") // Header -> Categories -> Repairs&Maintenance
    public WebElement categoriesRepairAndMaintenance;

    @FindBy(xpath = "//*[@id='shops-tab']") // Repairs&Maintenance -> Shops
    public WebElement Shops;

    @FindBy(xpath = "//*[@id='services-tab']") // Repairs&Maintenance -> Service
    public WebElement Service;

    @FindBy(xpath = "//*[@id='filter_search']") // Repairs&Maintenance -> filter
    public WebElement filterElement;

    @FindBy(xpath = "//div[1]/div//h4/a")
    public List<WebElement> repairAndMaintenanceServicesList;



    @FindBy (xpath = "//span[text()='Moving & Transportation']")
    public WebElement homePageMovingTransportationCard;


    @FindBy (xpath = "//li[@class='nav-item active']") //moving&transportation Shops butonu
    public WebElement movingAndTransportationShopsButon;

    @FindBy (xpath = "//li[@class='nav-item active']") //moving&transportation Service butonu
    public WebElement movingAndTransportationServiceButon;

    @FindBy (xpath = "//div[@class='row']") //M & T shops listesi
    public WebElement movingAndTransportationShopslist;

    @FindBy (xpath = "//div[@class='row'][1]") //M & T shops
    public WebElement movingAndTransportationIlkShop;



    @FindBy (xpath ="//a[text()='Visit Store ']")
    public WebElement movingAndTransportationShopslistVisitStoreLink;





    @FindBy (xpath ="//a[text()='Become a Professional']") // Header bölümündeki ABecome a Professional Linki
    public WebElement headerBecomeaProfessionalLink;


    @FindBy (xpath ="//a[text()='Become a User']") // Header bölümündeki ABecome a Professional Linki
    public WebElement headerBecomeaUserlink;


    @FindBy (xpath ="//a[text()='About US']") // Header bölümündeki About US Linki
    public WebElement headerAboutUSLink;


    @FindBy (xpath = "//div[@class='inner-tab-shop'][1]") //
    public WebElement shopsDetail;

    @FindBy (xpath = "//div[@class='card-body']")
    public WebElement shopAvaibility;

    @FindBy (xpath = "//h2[text()='Services']")
    public WebElement servicesList;


}
