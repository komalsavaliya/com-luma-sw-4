package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //***********************************Women Menu***************************************//
    //* Mouse Hover on Women Menu
    By mouseHoverToWomenMenuList = By.xpath("//span[normalize-space()='Women']");

    public void mouseHoverToWomenMenuList() {
        mouseHoverToElement(mouseHoverToWomenMenuList);
    }

    // * Mouse Hover on Tops
    By mouseHoverOnWomenTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    public void mouseHoverOnWomenTops() {
        mouseHoverToElement(mouseHoverOnWomenTop);
    }

    //* Click on Jackets
    By jakets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jakets);
    }

    //***********************************Men Menu***************************************//

    //* Mouse Hover on Men Menu
    By mouseHoverToMenMenuList = By.xpath("//span[normalize-space()='Men']");

    public void mouseHoverToMenMenuList() {
        mouseHoverToElement(mouseHoverToMenMenuList);
    }

    //* Mouse Hover on Bottoms
    By mouseHoverOnMenBottoms = By.xpath("//a[@id='ui-id-18']");

    public void mouseHoverToBottoms() {
        mouseHoverToElement(mouseHoverOnMenBottoms);
    }

    //* Click on Pants
    By pants =  By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");


    public void clickOnPants() {
     mouseHoverToElementAndClick(pants);
    }
    //***********************************Gear Menu***************************************//

    //* Mouse Hover on Gear Menu
    By mouseHoverToGearMenu = By.xpath("//span[normalize-space()='Gear']");

    public void mouseHoverToGearMenuList(){
        mouseHoverToElement(mouseHoverToGearMenu);
    }
    //* Click on Bags
    By bags =  By.xpath("//span[normalize-space()='Bags']");
    public void clickOnBags(){
        clickOnElement(bags);
    }
}
