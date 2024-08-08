package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RepairsAndMaintenance {

    public RepairsAndMaintenance() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ

    @FindBy(xpath = "//*[@id='filter_search']")// Repairs&Maintenance -> filter
    public WebElement filterElement;

    @FindBy(xpath = "//*[@id='shops-tab']") // Repairs&Maintenance -> Shops
    public WebElement Shops;

    @FindBy(xpath = "//*[@id='services-tab']") // Repairs&Maintenance -> Service
    public WebElement Service;

    @FindBy(xpath = "//*[@id='dataListShop']/div/div/div/div[4]")  // Repairs&Maintenance -> Shops -> Visit Store Element
    public List<WebElement> shopsVisitStoreText;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[1]/div[2]/p")
    public WebElement priceInfo;//Price info of service (Maintenance & Repair -> Services -> All of them)

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[1]")
    public WebElement serviceDetailsOfService; // Maintenance & Repair -> Services -> Any -> Service Details

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div/div[3]/div")
    public WebElement availabilityOfService; // Maintenance & Repair -> Services -> Any -> Service Availability

    @FindBy(xpath = "//div[1]/div/div[2]/div/div/div[2]/div[2]/div//h4/a")
    public List<WebElement> servicesList; // Maintenance & Repair -> Services as a List


}
