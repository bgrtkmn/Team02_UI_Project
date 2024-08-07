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



}
