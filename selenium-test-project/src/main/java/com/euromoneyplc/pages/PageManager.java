package com.euromoneyplc.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class PageManager {

    private WebDriver driver;

    public MainPage mainPage;
    public TeamPage teamPage;
    public MainMenuPage mainMenuPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
        mainPage = initElements(new MainPage(this));
        teamPage = initElements(new TeamPage(this));
        mainMenuPage = initElements(new MainMenuPage(this));
    }

    private <T extends BasePage> T initElements(T page) {
        PageFactory.initElements(driver, page);
        return page;
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}
