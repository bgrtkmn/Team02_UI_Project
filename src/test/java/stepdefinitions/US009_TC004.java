package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OmmServicePage;
import pages.OmmShops;
import utilities.Driver;

public class US009_TC004 {


    OmmShops ommShops = new OmmShops();


    @Given("Ziyaretçi Shops Butonuna Tıklar.")
    public void ziyaretçi_shops_butonuna_tıklar() {
    ommShops.BusinessServiceShopsButton.click();

    }
    @Given("Ziyaretçi açılan sayfada filter ikonunu görüntüler ve tıklar.")
    public void ziyaretçi_açılan_sayfada_filter_ikonunu_görüntüler_ve_tıklar() {
    ommShops.BusinessServiceFilterButton.isDisplayed();
    ommShops.BusinessServiceFilterButton.click();

    }
    @Given("Ziyaretçi Açılan Search Formda Location, Sory By, Keyword, Categories, Sub Category, Prince Range alanlarını görüntüler.")
    public void ziyaretçi_açılan_search_formda_location_sory_by_keyword_categories_sub_category_prince_range_alanlarını_görüntüler() {
    ommShops.FilterLocation.isDisplayed();
    ommShops.FilterSortBy.isDisplayed();
    ommShops.FilterKeyword.isDisplayed();
    ommShops.FilterCategories.isDisplayed();
    ommShops.FilterSubCategory.isDisplayed();
    ommShops.FilterPriceRange.isDisplayed();

    }

    @Given("Ziyaretçi Açılan Search Formdaki Search Butonunu görüntüler ve tıklar.")
    public void ziyaretçi_açılan_search_formdaki_search_butonunu_görüntüler_ve_tıklar() {
    ommShops.FilterSearchButton.isDisplayed();
    ommShops.FilterSearchButton.click();

    }
    @Given("Ziyaretçi Açılan Search formdaki istediği filtrelemeleri seçip search butonuna tıklar.")
    public void ziyaretçi_açılan_search_formdaki_istediği_filtrelemeleri_seçip_search_butonuna_tıklar() {
    ommShops.FilterKeyword.sendKeys("TechGuard");
    ommShops.FilterSearchButton.click();

    }


}
