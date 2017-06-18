package com.loveholidays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This class is for selection of browser which will get instruction from .properties file.
 */
public class BrowserSelector extends Utils {

    // This is object of LoadProp class
    LoadProp loadProp = new LoadProp();

    // This is for passing key to Browser run from config.properties
    String browser = loadProp.getProperty("browser");

    public void selectBrowser() {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("IE")) {

            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
            caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
            caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
            caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
            caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver(caps);

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else {
            System.out.println(" Browser name is Wrong ");
        }
    }

}
