package com.loveholidays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *This class is base page where driver is declared adn Method for page factory initialization.
 */
public class BasePage {

    //driver declaration
    public static WebDriver driver;


    public BasePage()
    {
        PageFactory.initElements(driver,this);
    }
}
