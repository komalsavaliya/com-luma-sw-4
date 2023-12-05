package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MensPage extends Utility {

    //* Mouse Hover on product name‘Cronus Yoga Pant’
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    public void mouseHoverCronesYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    //* and click on size 32.
    By clickOnCronesYogaPant = By.xpath("(//div[@class='swatch-option text'])[1]");

    public void clickOnSize(int size) {
        mouseHoverToElementAndClick(clickOnCronesYogaPant);
    }

    //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
    By colorOfPant = By.xpath("(//div[@class='swatch-option color'])[1]");

    public void mouseHoverAndClickOnColor(String color) {
        mouseHoverToElementAndClick(colorOfPant);
    }

    //* Mouse Hover on product name ‘Cronus Yoga Pant’
    By mouseHoverToProductName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    public void mouseHoverToCronusYogaPant() {
        mouseHoverToElement(mouseHoverToProductName);
    }

    //* and click on ‘Add To Cart’ Button.
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyTextAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    public String getTextCronusYogaPantAdded() {
        return getTextFromElement(verifyTextAdded);
    }

    //* Click on ‘shopping cart’ Link into message
    By clickOnMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnShoppingCartLinkInsideMessage() {
        clickOnElement(clickOnMessage);
    }
}