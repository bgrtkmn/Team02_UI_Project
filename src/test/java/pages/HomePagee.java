package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePagee {
    public HomePagee(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//section[@class='hero-section']")
    public WebElement homePageLogo; // anasayfanın body bolumunde yer alan fotografa ait

    @FindBy(xpath = "//a[normalize-space()='Categories']")
    public WebElement homePageCategories;

    @FindBy(xpath = "//span[normalize-space()='Moving & Transportation']")
    public WebElement movingAndTransportation;

    @FindBy(xpath = "//a[normalize-space()='Shops']")
    public WebElement homePageShops;

    @FindBy(xpath = "//a[@id='shops-tab']")
    public WebElement shopsLogo;

    @FindBy(xpath = "//a[@id='services-tab']" )
    public WebElement servicesLogo;

    @FindBy(xpath = "//a[normalize-space()='Visit Store']")
    public WebElement visitStore;

    @FindBy(xpath = "//div[@class='shop-header-inner']")
    public WebElement horizonMoversInfo;

    @FindBy(xpath = "//a[normalize-space()='Local Moving']")
    public WebElement localMoving;

    @FindBy(xpath = "//div[@class='card provider-widget clearfix']//div[@class='card-body']")
    public WebElement serviceProvideInfo;

    @FindBy(xpath = "//div[@class='card available-widget']//div[@class='card-body']")
    public WebElement serviceAvailabityInfo;

    @FindBy(xpath = "//h3[normalize-space()='Service Details']")
    public WebElement serviceDetailsInfo;

    @FindBy(xpath = "//h3[normalize-space()='Additional Services']")
    public WebElement additionalServicesInfo;

    @FindBy(xpath = "//h3[normalize-space()='Reviews']")
    public WebElement reviewsInfo;

    @FindBy(xpath = "//h4[@class='card-title service-related']")
    public WebElement relatedServicesInfo;

    @FindBy(xpath = "//img[@src='https://qa.onlinemastermarket.com/assets/img/filter-icon.png']")
    public WebElement filterIcon;

    @FindBy(xpath = "//label[normalize-space()='Location']")
    public WebElement locationFilter;

    @FindBy(xpath = "//label[normalize-space()='Categories']")
    public WebElement categoriesInfo;

    @FindBy(xpath = "//a[normalize-space()='Full House Cleaning']")
    public WebElement fullHouseCleaning;

    @FindBy(xpath = "//span[@id='select2-categories-container']")
    public WebElement filterCategories;

    @FindBy(xpath = "//span[@id='select2-subcategories-container']")
    public WebElement filterSubCategory;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[normalize-space()='Haircut']")
    public WebElement hairCutServices;





}
