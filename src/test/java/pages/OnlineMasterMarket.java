package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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


}
