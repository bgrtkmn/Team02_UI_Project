package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OmmShops;

public class US009_TC005 {

    OmmShops ommShops = new OmmShops();


    @Given("Ziyaretçi Service Butonuna Tıklar.")
    public void ziyaretçi_service_butonuna_tıklar() {

        ommShops.BusinessServiceServiceButton.click();

    }


}
