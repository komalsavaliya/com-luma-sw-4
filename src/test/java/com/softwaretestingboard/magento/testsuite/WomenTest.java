package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * 1. Write down the following test into WomenTestclass
 * 1. verifyTheSortByProductNameFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Product Name”
 * * Verify the products name display in
 * alphabetical order
 * 2. verifyTheSortByPriceFilter
 * * Mouse Hover on Women Menu
 * * Mouse Hover on Tops
 * * Click on Jackets
 * * Select Sort By filter “Price”
 * * Verify the products price display in
 * Low to High
 */

public class WomenTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverToWomenMenuList();

        //* Mouse Hover on Tops
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenTops();

        //* Click on Jackets
        Thread.sleep(2000);
        homePage.clickOnJackets();

        //* Select Sort By filter “Product Name”
        Thread.sleep(2000);
        womenPage.sortByFilterProductName("Product Name ");


        //* Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListFromWebElements(womenPage.sortingJacketsList());
        System.out.println("Actual Jackets List : " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(womenPage.sortingJacketsList());
        System.out.println("Expected Jackets List : " + expectedList);

        actualList.sort(String.CASE_INSENSITIVE_ORDER);//Ascending order

        Assert.assertEquals(actualList, expectedList, "Products name not sorted!");
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverToWomenMenuList();

        //* Mouse Hover on Tops
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenTops();

        //* Click on Jackets
        Thread.sleep(2000);
        homePage.clickOnJackets();

        //Select Short By Filter "Price"
        womenPage.sortByPriceFilter("Price");

        //* Verify the products price display in Low to High
        ArrayList<String> actualList = getArrayListFromWebElements(womenPage.sortingInPriceList());
        System.out.println("Actual Price List : " + actualList);
        ArrayList<String> expectedList = getArrayListFromWebElements(womenPage.sortingInPriceList());
        System.out.println("Expected Price List : " + expectedList);

        actualList.sort(String.CASE_INSENSITIVE_ORDER);//Ascending order

        Assert.assertEquals(actualList, expectedList, "Price not sorted in list!");

    }
}
