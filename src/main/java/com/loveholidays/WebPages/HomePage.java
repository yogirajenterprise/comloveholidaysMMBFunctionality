package com.loveholidays.WebPages;

import com.loveholidays.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Home page functionality methods
 */
public class HomePage extends Utils{

    //locator for Manage My Booking on home page menu bar next to FAQS tab.
    @FindBy(xpath = "//a[contains(text(),'Manage My Booking')]")
    WebElement _ManageMyBooking;

    //method for to click on Manage My Booking on home page menu bar next FAQS
    public void clickOnManageMyBooking()
    {
     clickOnElement(_ManageMyBooking);
    }
}
