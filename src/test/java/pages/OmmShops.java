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
