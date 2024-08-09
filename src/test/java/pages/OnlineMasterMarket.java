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

    @FindBy(xpath = "//*[@id='emailregistration_finals']")
    public WebElement passwordLogin; //password confirmation button

    @FindBy(xpath = "//*[@id='emaillogin_submit']") // Email ve password'u onaylamak icin enter butonu
    public WebElement enterButton;

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/a/span/img")
    public WebElement profileIconButton; //Profile icon in the main page

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[4]/div/a[1]")
    public WebElement profileButtonDashboard; //Dashboard web element in Profile Dropdown menu

    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div/div[1]/div/div[1]/div[2]/ul/li[11]/a")
    public WebElement subscriptionButton; // main page -> profile icon -> dashboard -> subscription

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[1]/div[2]/p")
    public WebElement priceInfo;//Price info of service (Maintenance & Repair -> Services -> All of them)

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[1]")
    public WebElement serviceDetailsOfService; // Maintenance & Repair -> Services -> Any -> Service Details

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/div")
    public WebElement availabilityOfService; // Maintenance & Repair -> Services -> Any -> Service Availability

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[2]/a")
    public WebElement notificationIcon; //notification icon on the main page

    @FindBy(xpath = "/html/body/div[1]/header/nav/ul/li[2]/div/div[3]/a")
    public WebElement viewAllNotification; //notification icon -> view all notifications

    @FindBy(xpath = "//*[@id='not_del']")
    public List<WebElement> deleteIconList; //notification icon -> view all notifications -> deleteButtonList

    @FindBy(xpath = "//*[@id='confirm_delete_sub']")
    public WebElement confirmOfNotificationDeletion; //notification icon -> view all notifications -> deleteButtonList -> Confirmation

    @FindBy(xpath = "//*[@id='dataList']/div[11]/ul/li/a")
    public List<WebElement> notificationListPageNumber; //notification icon -> view all notifications -> Number of notifications

    @FindBy(xpath = "//*[@id='not_del_all']/i")
    public WebElement deleteAllButton; //notification icon -> view all notifications -> delete all

    @FindBy(xpath = "//*[@id='search-blk']") // Homepage Searchbar
    public WebElement searchBar;

    @FindBy(xpath = "//*[@*='//section[4]//div/div[2]/h4/a']") // Homepage Most Popular Services
    public List<WebElement> quickServicesList;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]")
    public WebElement headerMenuCategories; //main page header menu categories

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]/ul/li[2]/a") // Header -> Categories -> Repairs&Maintenance
    public WebElement categoriesRepairAndMaintenance;

    @FindBy(xpath = "//*[@id='shops-tab']") // Repairs&Maintenance -> Shops
    public WebElement Shops;

    @FindBy(xpath = "//*[@id='services-tab']") // Repairs&Maintenance -> Service
    public WebElement Service;

    @FindBy(xpath = "//*[@id='filter_search']") // Repairs&Maintenance -> filter
    public WebElement filterElement;

    @FindBy(xpath = "/html/body/div[1]/section[4]/div/div[1]/div") //Main page -> scrool to
    public WebElement mostPopularServicePosition;

    @FindBy(xpath = "//div[1]/div//h4/a")
    public List<WebElement> repairAndMaintenanceServicesList; //main page -> categories -> services and maintenance -> -services -> Services List

    @FindBy(xpath = "/html/body/div[1]/section[4]/div/div[2]/div[1]/div/div/div[3]/button")
    public List<WebElement> popularServicesSliderList; //Main page Popular services list slider

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]/ul/li[2]/a")
    public WebElement headerCategoriesRepAndMaint; //Main page -> categories Repair and Maintenance

}
