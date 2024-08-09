package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RepairsAndMaintenance {

    public RepairsAndMaintenance() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // @FindBy(xpath="//*[@*=' ']") formatında
    // web sayfasına ait web elementlerin locate'i alınacaktır.

    //LOCATE'i ALINAN WEB ELEMENTLERI ICIN ACIKLAYICI YORUM SATIRI YAZINIZ

    @FindBy(xpath = "//*[@id='filter_search']")// Repairs&Maintenance -> filter
    public WebElement filterElement;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]")
    public WebElement headerMenuCategories;

    @FindBy(xpath = "/html/body/div[1]/header/nav/div[2]/ul/li[2]/ul/li[2]/a") // Header -> Categories -> Repairs&Maintenance
    public WebElement categoriesRepairAndMaintenance;

    @FindBy(xpath = "(//*[text()='Repairs & Maintenance'])[1]") // Header > Category > Repairs & Maintenance
    public WebElement repairsAndMaintenanceHeader;

}
