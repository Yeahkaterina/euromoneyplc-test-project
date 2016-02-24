package com.euromoneyplc.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

    public BasePage(PageManager pages) {
        this.pages = pages;
        driver = pages.getWebDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public void click(WebElement element){
        waitForLoad();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        ExpectedCondition expectation = o -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState").equals("complete");
        wait.until(expectation);
    }
}
