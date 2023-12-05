package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link into
 * message
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00’
 */

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.mouseHoverToGearMenuList();

        //* Click on Bags
        homePage.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        bagsPage.mousehoverOnOverNightDuffleProductName();

        //* Verify the text ‘Overnight Duffle’
        String actualProductName = overnightDufflePage.verifyOvernightDuffleTextOnPage();
        String exceptedProductName = "Overnight Duffle";
        Assert.assertEquals(actualProductName, exceptedProductName, "Incorrect Product Name displayed!");

        //* Change Qty 3
        Thread.sleep(2000);
        overnightDufflePage.clearQuantityField();

        Thread.sleep(2000);
        overnightDufflePage.changeQuantityNumber("3");


        //* Click on 'Add to Cart’ Button.
        Thread.sleep(2000);
        overnightDufflePage.clickOnAddToCart();

        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Thread.sleep(2000);
        String actualText = overnightDufflePage.verifyItemsAddedToShoppingCart();
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(actualText, expectedText, "Incorrect Message Displayed!");

        //* Click on ‘shopping cart’ Link into message
        overnightDufflePage.clickOnShoppingCartLinkInsideMessage();

        //* Verify the product name ‘Overnight Duffle’
        Thread.sleep(2000);
        String actualProductItemName = shoppingCartPage.verifyProductNameCronusYogaPant();
        String expectedProductItemName = "Overnight Duffle";
        Assert.assertEquals(actualProductItemName, expectedProductItemName, "Incorrect Product Name Displayed!");

        //* Verify the Qty is ‘3’
        Thread.sleep(2000);
        String actualProductQuantity = shoppingCartPage.verifyTheQuantityIsThree();
        String expectedProductQuantity = "3";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity, "Incorrect Quantity Displayed!");

        //* Verify the product price ‘$135.00’
        Thread.sleep(2000);
        String actualProductPrice = shoppingCartPage.verifyProductPrice();
        String expectedProductPrice = "$135.00";
        Assert.assertEquals(actualProductPrice, expectedProductPrice, "Incorrect Price Displayed!");

        //* Change Qty to ‘5’
        shoppingCartPage.clearQuantityField();
        Thread.sleep(2000);
        shoppingCartPage.changeQuantityNumber("5");
        Thread.sleep(2000);

        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.clickOnUpdateShoppingCart();

        //* Verify the product price ‘$225.00’
        Thread.sleep(2000);
        String actualProductTotalPrice = shoppingCartPage.verifyTheProductTotalPrice();
        String expectedProductTotalPrice = "$225.00";
        Assert.assertEquals(actualProductTotalPrice, expectedProductTotalPrice, "Incorrect total price displayed!");
    }
}




