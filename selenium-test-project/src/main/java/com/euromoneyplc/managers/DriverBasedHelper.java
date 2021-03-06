package com.euromoneyplc.managers;

import com.euromoneyplc.pages.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class DriverBasedHelper {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    public DriverBasedHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        pages = new PageManager(driver);
    }
}
