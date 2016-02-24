package com.euromoneyplc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class MainPage extends AnyPage {

    public MainPage(PageManager pages) {
        super(pages);
    }

    @FindBy(className = "icon-nav")
    private WebElement menuIcon;

    public void openMainMenu(){
        menuIcon.click();
    }
}
