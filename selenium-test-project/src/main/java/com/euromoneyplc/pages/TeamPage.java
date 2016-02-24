package com.euromoneyplc.pages;

import com.euromoneyplc.utils.PropertyLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class TeamPage extends AnyPage {

    public final String url = PropertyLoader.loadProperty("site.url") + "who-we-are";

    public TeamPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//div[@class = 'col col_main']/h1")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class = 'col col_main']/img[contains(@src, '.jpg')]")
    private WebElement picture;

    public boolean isTitlePresent() {
        return pageTitle.isDisplayed();
    }

    public boolean isFirstImageUrlPresent() {
        return picture.isDisplayed();
    }
}
