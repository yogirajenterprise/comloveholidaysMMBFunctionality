package com.loveholidays;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by Prakash Narola on 17/06/2017.
    Reusable methods
 */

public class Utils extends BasePage {


    //reusable method for to click on element
    public static void clickOnElement(WebElement element) {
        element.click();
    }

    //reusable method for to type any text in the form or field
    public static void sendKey(WebElement element, String text) {
        element.sendKeys(text);
    }

    //Assertion reusable method by getting text from element and compare with expected text
    public static void AssertionByGettingText(WebElement element,String expectedText, String errorMessage)
    {
        Assert.assertEquals(element.getText(),expectedText,errorMessage);
    }

    //Assert True reusable method by getting attribute value
    public static void AssertTrueByAttribute(WebElement element,String attributeName, String expectedText,String errorMessage)
    {
    Assert.assertTrue(element.getAttribute(attributeName).contains(expectedText),errorMessage);
    }

}
