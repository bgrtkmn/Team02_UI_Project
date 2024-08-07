package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OmmHomepage;
import pages.OmmShops;

public class US024_TC001 {

    OmmHomepage ommHomepage = new OmmHomepage();
    OmmShops ommShops = new OmmShops();

    @Given("Ziyaretçi body bölümündeki Most Popular Services başlığını görüntüler.")
    public void ziyaretçi_body_bölümündeki_most_popular_services_başlığını_görüntüler() {
    ommHomepage.BodyMostPopularServices.isDisplayed();

    }
    @Given("Ziyaretçi başlık altında bulunan slayderda Firma isim, konum, fiyat bilgilerini görüntüler.")
    public void ziyaretçi_başlık_altında_bulunan_slayderda_firma_isim_konum_fiyat_bilgilerini_görüntüler() {
        ommShops.ShopServiceLocation.isDisplayed();
        ommShops.ShopServiceAmount.isDisplayed();
        ommShops.ShopServiceSirketIsmi.isDisplayed();


    }
    @Given("Ziyaretçi başlık altında bulunan slayderda herhangi bir hizmete tıklar ve ilgili sayfaya ulaşır.")
    public void ziyaretçi_başlık_altında_bulunan_slayderda_herhangi_bir_hizmete_tıklar_ve_ilgili_sayfaya_ulaşır() {


    }

}
