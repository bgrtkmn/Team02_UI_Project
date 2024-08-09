package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OmmCategories;
import pages.OmmShops;

public class US014_TC004 {

    OmmShops ommShops = new OmmShops();
OmmCategories OmmCategories = new OmmCategories();

    @Given("Kullanici Shops ve Service Butonuna Tıklar.")
    public void kullanici_shops_butonuna_tıklar() {
        OmmCategories.HomeServisShops.click();
        OmmCategories.HomeServisService.click();
    }
    @Given("Kullanici acılan sayfada filter ikonunu görüntüler ve tıklar.")
    public void kullanici_acilan_sayfada_filter_ikonunu_görüntüler_ve_tiklar() {
        ommShops.FilterButton.isDisplayed();
        ommShops.FilterButton.click();
        }

    @Given("Kullanici Acılan Search Formda Location, Sory By, Keyword, Categories, Sub Category, Prince Range alanlarını görüntüler.")
    public void kullanici_acılan_search_formda_location_sory_by_keyword_categories_sub_category_prince_range_alanlarını_görüntüler() {
        ommShops.FilterLocation.isDisplayed();
        ommShops.FilterSortBy.isDisplayed();
        ommShops.FilterKeyword.isDisplayed();
        ommShops.FilterCategories.isDisplayed();
        ommShops.FilterSubCategory.isDisplayed();
        ommShops.FilterPriceRange.isDisplayed();
    }


    }


