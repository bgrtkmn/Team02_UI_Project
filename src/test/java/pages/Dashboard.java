package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
