package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OmmShops{

    public OmmShops(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ



    @FindBy(xpath = "//*[@class='card-title service-title']") // herhangi bir shopun availability kartı
    public WebElement ShopAvailability ;


    @FindBy(xpath = "//*[text()='Shop Details']") // herhangi bir shopun Shop detail başlığı
    public WebElement ShopDetails ;


    @FindBy(xpath = "//*[text()='Services']") // herhangi bir shopun Services başlığı
    public WebElement ShopServices ;


    @FindBy(xpath = "//*[@id='service_view']") // herhangi bir shopun Services Butonu
    public WebElement ShopServicesButton ;


    @FindBy(xpath = "//*[@id='services_lists']") // herhangi bir shopun Service bölümündeki card listesi
    public WebElement ShopServiceCard ;




    @FindBy(xpath = "(//*[@class='product-by'])[1]") // herhangi bir shopun Service bölümündeki ilk şirketin Şirket ismi
    public WebElement ShopServiceSirketIsmi ;

    @FindBy(xpath = "(//h6)[1]") // herhangi bir shopun Service bölümündeki ilk şirketin amount bilgisi
    public WebElement ShopServiceAmount ;

    @FindBy(xpath = "(//*[@class='fas fa-map-marker-alt me-2'])[1]") // herhangi bir shopun Service bölümündeki ilk şirketin location bilgisi
    public WebElement ShopServiceLocation ;



    @FindBy(xpath = "(//*[@class='categorie-img'])[1]") // herhangi bir shopun Service bölümündeki ilk şirketin fotoğrafı
    public WebElement ShopServiceilkSirketPhoto ;





    @FindBy(xpath = "//*[@id='shops-tab']") // Header > Categories Busieness Services > Shops Button
    public WebElement BusinessServiceShopsButton ;

    @FindBy(xpath = "//*[@id='services-tab']") // Header > Categories Busieness Services > Service Button
    public WebElement BusinessServiceServiceButton ;



    @FindBy(xpath = "//*[@class='btn filter-btn']") // Header > Categories Busieness Services > Filter Button
    public WebElement BusinessServiceFilterButton ;



    @FindBy(xpath = "//*[@class='form-control location pac-target-input']") // Header > Categories Busieness Services > Filter Location text Box.
    public WebElement FilterLocation ;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]") // Header > Categories Busieness Services > Filter Sory By seçim kutusu.
    public WebElement FilterSortBy ;

    @FindBy(xpath = "//*[@id='common_search']") // Header > Categories Busieness Services > Filter Keyword kartı.
    public WebElement FilterKeyword ;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]") // Header > Categories Busieness Services > Filter Categories seçim kutusu.
    public WebElement FilterCategories ;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]") // Header > Categories Busieness Services > Filter Sub Category seçim kutusu.
    public WebElement FilterSubCategory ;

    @FindBy(xpath = "(//*[@class='form-group'])[6]") // Header > Categories Busieness Services > Filter Prince Range kartı.
    public WebElement FilterPriceRange ;

    @FindBy(xpath = "//*[@class='btn btn btn-search btn-block get_services']") // Header > Categories Busieness Services > Filter SearchButton.
    public WebElement FilterSearchButton ;



}
