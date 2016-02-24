package com.euromoneyplc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class MainMenuPage extends AnyPage {

    public MainMenuPage(PageManager pages) {
        super(pages);
    }

    @FindBy(xpath = "//a[@data-parent = '#menu' and text() = 'Who we are']")
    private WebElement menuWho;

    @FindBy(xpath = "//a[@href = '/who-we-are' and text() = 'Who we are']")
    private WebElement subMenuWho;



    public void clickTeamLink() {
        click(menuWho);
        click(subMenuWho);
    }
}
