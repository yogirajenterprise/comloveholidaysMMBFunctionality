package com.loveholidays;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Prakash Narola on 17/06/2017.
 */
public class Hooks extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void OpenBrowser()
    {
        browserSelector.selectBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.loveholidays.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

}

