package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.OmmHomepage;

import static utilities.ReusableMethods.typeKeys;

public class US060_TC001 {

    OmmHomepage ommHomepage = new OmmHomepage();


    @Given("dashboard tiklanir")
    public void dashboard_tiklanir() {
        ommHomepage.profilDashboard.click();
    }

    @Given("Provider Dashboard sidebar'da Orders List linkine tiklanir")
    public void provider_dashboard_sidebar_da_orders_list_linkine_tiklanir() {
        ommHomepage.providerDashboardOrderList.click();
    }

    @Given("My Orders sayfasında filtreleme ikonlari goruntulenir")
    public void my_orders_sayfasında_filtreleme_ikonlari_goruntulenir() {
        Assert.assertTrue(ommHomepage.OrderListFiltreleme.isDisplayed());
    }

    @Given("Siparişi verilen ürün için onaylama yapilir")
    public void siparişi_verilen_ürün_için_onaylama_yapilir() {
        ommHomepage.acceptOrder.click();
        ommHomepage.changeToShipping.click();
        ommHomepage.outOfDelivery.click();
        ommHomepage.delivered.click();
    }

    @Given("iptal islemi yapiiir")
    public void iptal_islemi_yapiiir() {
        ommHomepage.cancelOrder.click();
        ommHomepage.cancelReason.sendKeys(".");
        ommHomepage.cancelYes.click();
    }

    @Given("provider e mail id i girilir")
    public void provider_e_mail_id_i_girilir() {

        typeKeys("info@team2.com", ommHomepage.loginId);
        ommHomepage.enterBtn.click();
    }
    @Given("provider password girilir")
    public void provider_password_girilir() {
        ommHomepage.password.sendKeys("Urban.123");
        ommHomepage.enterBtnPassword.click();
    }

}
