package com.euromoneyplc.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class WebDriverFactory {

    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";

    private static WebDriver webDriver = null;

    public static WebDriver getInstance(String browser){

            WebDriver webDriver = null;

            DesiredCapabilities capability = new DesiredCapabilities();
            String browserName = browser;

            if (CHROME.equals(browserName)) {
                capability = DesiredCapabilities.chrome();
                ChromeDriver driver = new ChromeDriver(capability);
                webDriver = driver;
            } else if (FIREFOX.equals(browserName)) {
                capability = DesiredCapabilities.firefox();
            }

            return webDriver;
        }
}
