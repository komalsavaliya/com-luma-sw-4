package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    //* Click on Product Name ‘Overnight Duffle’
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void mousehoverOnOverNightDuffleProductName(){
        mouseHoverToElementAndClick(overnightDuffle);
    }
}
