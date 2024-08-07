package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


    @FindBy(xpath = "//a[text()='Products']")  //Anasayfadaki shops altindaki produts link
    public WebElement shopsProductsLink;

    @FindBy(xpath = "//a[normalize-space()='Shops']")  //Anasayfadaki shops hover oldugunda
    public WebElement shopsHoverText;

    @FindBy(xpath = "//div[@class='product-content-wrap']")  // toplam ürünleri listeler
    public List<WebElement> productContentList;

    @FindBy(xpath = "(//a[@onclick='searchFilter(12)'])[1]")  // ürünler sayfasindaki 2. scrollBar
    public WebElement productsSecondBar;

    @FindBy(xpath = "//div[10]//div[1]//div[1]//div[1]//a[1]//img[1]")  // ürün icerigine girer
    public WebElement productsDetailsLink;

    @FindBy(xpath = "//h2[@class='title-detail']")  // ürün icerigine verify
    public WebElement productsDetailsText;

    @FindBy(xpath = "//button[@class='btn btn-prod-addcart add_cart_btn']")  // ürün icerigine addToCart Button
    public WebElement btnProdAddCart;

    @FindBy(xpath = "//a[@class='btn btn-prod-buynow add_buy_btn']")  // ürün icerigi buyNow Button
    public WebElement btnProdBuyNow;

    @FindBy(xpath = "//input[@id='adds']")  // ürün icerigi button plus
    public WebElement btnPlus;

    @FindBy(xpath = "//input[@id='subs']")  // ürün icerigi button minus
    public WebElement btnMinus;

    @FindBy(xpath = "//div[10]//div[1]//div[2]//div[4]//div[1]//a[1]")  // produts sayfasi addToCart Button
    public WebElement productsBtnAddToCart;

    @FindBy(xpath = "//ul[@class='category-list']")  // produts sayfasi categories List
    public WebElement productsCategoriesList;

    @FindBy(xpath = "//div[@class='selection-filter']")  // produts sayfasi price List
    public WebElement productsPriceList;

    @FindBy(xpath = "//label[@class='custom-radio me-2']")
    public List<WebElement> priceFilterCheckboxes;

    @FindBy(xpath = "//label[normalize-space()='Any price']//span[@class='checkmark']")  // products sayfasi price List
    public WebElement productsPriceListFirstCheckbox;

    @FindBy(xpath = "//label[normalize-space()='Under $25']//span[@class='checkmark']")  // products sayfasi price List
    public WebElement productsPriceListSecondCheckbox;

    @FindBy(xpath = "//label[normalize-space()='$25 to $50']//span[@class='checkmark']")  // products sayfasi price List
    public WebElement productsPriceListThirdCheckbox;

    @FindBy(xpath = "//label[normalize-space()='$50 to $100']//span[@class='checkmark']")  // products page price List
    public WebElement productsPriceListFourCheckbox;

    @FindBy(xpath = "//a[@id='3']")  // products sayfasi All Categories Under Repair link
    public WebElement productsAllCategoriesRepairToolsButton;

    @FindBy(xpath = "//div[@class='product-category']") // on the repair tools all products
    public List<WebElement> repairToolsAllProducts;

    @FindBy(xpath = "//div[@id='dataList']//div[1]//div[1]//div[1]//div[1]//a[1]//img[1]") // on the repair tools first products
    public List<WebElement> repairToolsFirstProducts;




}
