package com.euromoneyplc.managers;

import com.euromoneyplc.app.IApplicationManager;
import com.euromoneyplc.app.INavigationHelper;
import com.euromoneyplc.utils.PropertyLoader;
import com.euromoneyplc.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class ApplicationManager implements IApplicationManager{

    private INavigationHelper navHelper;

    private WebDriver driver;
    private String baseUrl;

    public ApplicationManager(){
        baseUrl = PropertyLoader.loadProperty("site.url");

        driver = WebDriverFactory.getInstance("chrome");
        navHelper = new NavigationHelper(this);
    }

    public INavigationHelper getNavigationHelper() {
        return navHelper;
    }

    protected WebDriver getWebDriver() {
        return driver;
    }

    protected String getBaseUrl() {
        return baseUrl;
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
        }
    }
}
