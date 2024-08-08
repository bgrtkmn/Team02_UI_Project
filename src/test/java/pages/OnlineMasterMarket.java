package pages;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//button[@name='search']") // homepage search box
    public WebElement searchBox;

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

    @FindBy(xpath = "(//*[text()='Repairs & Maintenance'])[1]") // Header > Category > Repairs & Maintenance
    public WebElement repairsAndMaintenanceHeader;

    @FindBy(xpath =" /html/body/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[1]") //Header> Category > Repairs & Maintenance > Shops
    public WebElement shopselement;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[2]") //Header> Category > Repairs & Maintenance > Service
    public WebElement serviceelement;

    @FindBy(xpath = "(//*[text()='Moving & Transportation'])[1]") // Header > Category > Moving & Transportation
    public WebElement movingAndTransportationHeader;

    @FindBy(xpath = "(//*[text()='Events'])[1]") // Header > Category > Events
    public WebElement eventsHeader;

    @FindBy(xpath = "(//*[text()='Personal Services'])[1]") // Header > Category > Personal Services
    public WebElement personalServicesHeader;

    @FindBy(xpath = "(//*[text()='Home Services'])[1]") // Header > Category > Home Services
    public WebElement homeServicesHeader;

    @FindBy(xpath = "(//*[@*='Logo'])[1]") // Page > Header > Logo
    public WebElement logoHeader;







    @FindBy(xpath = "(//*[@*='card-body'])[1]") // Categories Page homeServices Card body
    public WebElement homeServicesCardBody;

    @FindBy(xpath = "(//*[@*='card-body'])[2]") // Categories Page personalServices Card body
    public WebElement personalServicesCardBody;

    @FindBy(xpath = "(//*[@*='card-body'])[3]") // Categories Page events Card body
    public WebElement eventsCardBody;

    @FindBy(xpath = "(//*[@*='card-body'])[4]") // Categories Page businessServices Card body
    public WebElement businessServicesCardBody;

    @FindBy(xpath = "(//*[@*='card-body'])[5]") // Categories Page repairsAndMaintenance Card body
    public WebElement repairsAndMaintenanceCardBody;

    @FindBy(xpath = "(//*[@*='card-body'])[6]") // Categories Page movingAndTransportation Card body
    public WebElement movingAndTransportationCardBody;


    public WebElement getLocateWithText(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[text()='" + text + "']")); // Text halindeki locateleri alma
    }

    public WebElement getLocateAnyAttribute(String text) {
        return Driver.getDriver().findElement(By.xpath("//*[@*='" + text + "']")); // Herhangi bir locate alma
    }
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



