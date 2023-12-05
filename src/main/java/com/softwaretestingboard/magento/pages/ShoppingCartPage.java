package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    //* Verify the text ‘Shopping Cart.’
    By verifyTextForCart = By.xpath("//span[@class='base']");

    public String verifyShoppingCartText() {
        return getTextFromElement(verifyTextForCart);
    }

    //**********************************  Men Menu  ***************************************//

    //* Verify the product name ‘Cronus Yoga Pant’
    By checkProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    public String verifyProductsNameIsCronusYogaPant() {
        return getTextFromElement(checkProductName);
    }

    //* Verify the product size ‘32’
    By productSize = By.xpath("//dd[contains(text(),'32')]");

    public String verifyProductSizeIs32() {
        return getTextFromElement(productSize);
    }

    //* Verify the product colour ‘Black’
    By productColour = By.xpath("//dd[contains(text(),'Black')]");

    public String verifyProductColourIsBlack() {
        return getTextFromElement(productColour);
    }
    //****************************************     Gear Menu      **************************************************


    //* Verify the product name ‘Overnight Duffle’
    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    public String verifyProductNameCronusYogaPant() {
        return getTextFromElement(cronusYogaPant);
    }

    //* Verify the Qty is ‘3’
    By checkQuantity = By.xpath("//span[@class='counter-number']");

    public String verifyTheQuantityIsThree() {
        return getTextFromElement(checkQuantity);
    }

    //* Verify the product price ‘$135.00’
    By productPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    public String verifyProductPrice() {
        return getTextFromElement(productPrice);
    }


    //* Clear the amount first
    By clearQuantity = By.xpath("//td[@class ='col qty']/child::div[1]/descendant::input");

    public void clearQuantityField() {
        clearTextField(clearQuantity);
    }

    //* Change Qty to ‘5’
    By changeQuantity = By.xpath("//td[@class ='col qty']/child::div[1]/descendant::input");

    public void changeQuantityNumber(String quantity) {
        sendTextToElement(changeQuantity, quantity);
    }

    //* Click on ‘Update Shopping Cart’ button
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    //* Verify the product price ‘$225.00’
    By totalProductPrice = By.xpath("//span[contains(text(), '$225.00')]");

    public String verifyTheProductTotalPrice() {
        return getTextFromElement(totalProductPrice);
    }
}
