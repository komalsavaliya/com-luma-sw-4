package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage extends Utility {

    //* Select Sort By filter “Product Name”
    By productNameFilter = By.id("sorter");

    public void sortByFilterProductName(String filter){
        selectVisibleTextFromDropDown(productNameFilter,filter);
    }
    //* Verify the products name display in alphabetical order
    By sortingList = By.xpath("//strong[@class='product name product-item-name']//a");

    public List<WebElement> sortingJacketsList() {
        List<WebElement> listOfElement = findElementsList(sortingList);
        return listOfElement;
    }

    //* Select Sort By filter “Price”
    By priceFilter = By.id("sorter");

    public void sortByPriceFilter(String price) {
        selectVisibleTextFromDropDown(priceFilter, price);
    }

    //* Verify the products price display in Low to High
    By lowToHighPrice = By.xpath("//span[@class='price-wrapper ']//span");

    public List<WebElement> sortingInPriceList() {
        List<WebElement> listOfElement1 = findElementsList(lowToHighPrice);
        return listOfElement1;
    }

}
