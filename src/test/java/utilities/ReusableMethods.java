package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class ReusableMethods {

    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            System.out.println("Bekleme isleminde sorun olustu");
        }

    }

    public static List<String> stringListeDonustur(List<WebElement> webElementList){

        List<String> donusturulenList = new ArrayList<>();

        for (WebElement eachElement : webElementList
             ) {

            donusturulenList.add(eachElement.getText());
        }


        return donusturulenList;
    }

    public static void switchWindow(String hedefUrl){

        // birden fazla window acik iken bu method calisacak

        // 1- acik olan tum window'larin WHD'lerini bir Set olarak kaydedelim

        Set<String> tumWHDSeti = Driver.getDriver().getWindowHandles();

        // 2- bir for-each loop ile, her bir WHD'ini kullanip
        //    o window'a gidelim, eger gittigimiz window'da Url hedefUrl'e esit ise
        //    loop'u bitirelim

        for (String eachWHD : tumWHDSeti
             ) {

            Driver.getDriver().switchTo().window(eachWHD);

            if (Driver.getDriver().getCurrentUrl().equals(hedefUrl)){
                break;
            }

        }

    }

    public static void tumSayfaScreenshot(WebDriver driver){

        // 1- takesScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2- cekilen screenshot'i kaydedecegimiz dosyayi olusturalim


        String kaydedilecekDosyaYolu = "target/screenshots/tumSayfaSS.jpeg";

        // screenshot'in her calistiginda farkli isimde olmasi icin tarih damgasi ekleyelim

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarihDamgasi = ldt.format(dtf); // 240402123223

        kaydedilecekDosyaYolu = "target/screenshots/tumSayfaSS"+tarihDamgasi+".jpeg";

        File tumSayfaScreenshot = new File(kaydedilecekDosyaYolu);

        // 3- tss objesini kullanarak screenshot alip, gecici bir dosyaya kaydedelim

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi, asil kaydetmek istedigimiz dosyaya kopyalayalim

        try {
            org.apache.commons.io.FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaScreenshot(WebDriver driver,String raporIsmi){

        // 1- takesScreenshot objesi olusturalim
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2- cekilen screenshot'i kaydedecegimiz dosyayi olusturalim


        String kaydedilecekDosyaYolu = "target/screenshots/tumSayfaSS.jpeg";

        // screenshot'in her calistiginda farkli isimde olmasi icin tarih damgasi ekleyelim

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarihDamgasi = ldt.format(dtf); // 240402123223

        kaydedilecekDosyaYolu = "target/screenshots/"+raporIsmi+tarihDamgasi+".jpeg";

        File tumSayfaScreenshot = new File(kaydedilecekDosyaYolu);

        // 3- tss objesini kullanarak screenshot alip, gecici bir dosyaya kaydedelim

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi, asil kaydetmek istedigimiz dosyaya kopyalayalim

        try {
            org.apache.commons.io.FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webelementScreenshot(WebElement istenenElement){

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarihDamgasi = ldt.format(dtf); // 240402123223

        String kaydedilecekDosyaYolu = "target/screenshots/webelementSS"+tarihDamgasi+".jpeg";

        // 1- screenshot alinacak webelemnti locate edip kaydedelim

        // 2- screenshot'in kaydedilecegi dosyayi olusturalim

        File webelementSS = new File(kaydedilecekDosyaYolu);

        // 3- screenshot alip gecici dosyaya kaydedelim

        File geciciDosya = istenenElement.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi ana dosyaya kopyalayalim

        try {
            org.apache.commons.io.FileUtils.copyFile(geciciDosya,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void webelementScreenshot(WebElement istenenElement,String raporIsmi){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String tarihDamgasi = ldt.format(dtf); // 240402123223

        String kaydedilecekDosyaYolu = "target/screenshots/"+raporIsmi+tarihDamgasi+".jpeg";

        // 1- screenshot alinacak webelemnti locate edip kaydedelim

        // 2- screenshot'in kaydedilecegi dosyayi olusturalim

        File webelementSS = new File(kaydedilecekDosyaYolu);

        // 3- screenshot alip gecici dosyaya kaydedelim

        File geciciDosya = istenenElement.getScreenshotAs(OutputType.FILE);

        // 4- gecici dosyayi ana dosyaya kopyalayalim

        try {
            org.apache.commons.io.FileUtils.copyFile(geciciDosya,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().contains(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //===============Thread.sleep Wait==============//
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        //WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for element matching the locator to be visible on the page
     *
     * @param locator
     * @param timeout
     * @return
     */
    public static WebElement waitForVisibility(By locator, int timeout) {
        //WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Waits for provided element to be clickable
     *
     * @param element
     * @param timeout
     * @return
     */
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        //WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    /**
     * waits for backgrounds processes on the browser to complete
     *
     * @param timeOutInSeconds
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOutInSeconds));
            //WebDriverWait wait = new WebDriverWait(Driver.get(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }

    /**
     * checks that an element is present on the DOM of a page. This does not
     * * necessarily mean that the element is visible.
     *
     * @param by
     * @param time
     */
    public static void waitForPresenceOfElement(By by, long time) {
        // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myElement")));
        //new WebDriverWait(Driver.get(), time).until(ExpectedConditions.presenceOfElementLocated(by));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static WebElement waitForClickable(WebElement webElement) {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));

        return webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void scrollUpToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }



    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        ReusableMethods.waitFor(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }}

    //******************************hover*************
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }
}
