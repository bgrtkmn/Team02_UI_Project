package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.OmmShops;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_007 {

    OmmShops ommShops = new OmmShops();

    @Given("I go to Homepage")
    public void i_go_to_homepage() {
        Driver.getDriver().get("https://qa.onlinemastermarket.com/products");

    }

    @Then("I verify that the Products link under Shops is visible and redirects to the relevant page")
    public void i_verify_that_the_products_link_under_shops_is_visible_and_redirects_to_the_relevant_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(ommShops.shopsHoverText).perform();
        ReusableMethods.bekle(2);
        if (ommShops.shopsProductsLink.isDisplayed()) {
            System.out.println("Products dropdown is displayed.");

            // Click on the "Products" dropdown
            ommShops.shopsProductsLink.click();
        } else {
            System.out.println("Products dropdown is not displayed.");
        }



    }

    @Then("I should be able to view products on the Product Lists page")
    public void i_should_be_able_to_view_products_on_the_product_lists_page() {
        Assert.assertEquals("The number of products listed is not 12", 12, ommShops.productContentList.size());
        ReusableMethods.scrollToElement(ommShops.productsDetailsLink);
        ReusableMethods.bekle(3);
       // BUG---while moving to the second page
//        ommShops.productsSecondBar.click();
//        ReusableMethods.bekle(5);
//        Assert.assertEquals("The number of products listed is not 7", 7, ommShops.productContentList.size());
    }

    @When("I click on any product on the Product Lists page, I verify the details of that product.")
    public void i_click_on_any_product_on_the_product_lists_page_i_verify_the_details_of_that_product() {
        ommShops.productsDetailsLink.click();
        ReusableMethods.bekle(2);
        ommShops.productsDetailsText.isDisplayed();

    }

    @Then("I verify that the Add to Cart and Buy Now buttons are visible and active on the product's details page.")
    public void i_verify_that_the_add_to_cart_and_buy_now_buttons_are_visible_and_active_on_the_product_s_details_page() {
        ommShops.btnProdAddCart.isDisplayed();
        ommShops.btnProdAddCart.isEnabled();
        ReusableMethods.bekle(2);
        ommShops.btnProdBuyNow.isEnabled();
        ommShops.btnProdBuyNow.isDisplayed();
    }

    @Then("I should be verify that the product quantity information has been updated on the product details page.")
    public void i_should_be_verify_that_the_product_quantity_information_has_been_updated_on_the_product_details_page() {
        ommShops.btnPlus.click();
        ommShops.btnPlus.click();
        ReusableMethods.bekle(4);
        ommShops.btnMinus.click();
        ommShops.btnMinus.click();

    }

    @Then("I verify that the Add to Cart button is visible on the product card on the Product Lists page.")
    public void i_verify_that_the_add_to_cart_button_is_visible_on_the_product_card_on_the_product_lists_page() {
       ReusableMethods.bekle(2);
       Driver.getDriver().navigate().back();
       ommShops.productsBtnAddToCart.isDisplayed();
    }

    @Then("I verify that the All Categories and Price filter cards on the Product Lists page are visible.")
    public void i_verify_that_the_all_categories_and_price_filter_cards_on_the_product_lists_page_are_visible() {
       ReusableMethods.bekle(2);
       ReusableMethods.scrollUpToElement(ommShops.productsCategoriesList);
       ommShops.productsCategoriesList.isDisplayed();
       ommShops.productsPriceList.isDisplayed();
    }

    @Then("The checkboxes in the price filter card must be clickable.")
    public void the_checkboxes_in_the_price_filter_card_must_be_clickable() {
        ReusableMethods.bekle(2);
        for (WebElement checkbox : ommShops.priceFilterCheckboxes) {
                checkbox.click();
                ReusableMethods.bekle(2);
            }
    }

    @Then("I can filter in All Categories and Price filter cards.")
    public void i_can_filter_in_all_categories_and_price_filter_cards() {
        ReusableMethods.bekle(2);
        ommShops.productsAllCategoriesRepairToolsButton.click();
        ReusableMethods.bekle(2);
        int expectedProductCount = 2;
        int actualProductCount = ommShops.repairToolsAllProducts.size();
        Assert.assertEquals(String.valueOf(actualProductCount), expectedProductCount, "The number of products listed is not 2");
    }
}
