package com.euromoneyplc.managers;

import com.euromoneyplc.app.INavigationHelper;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class NavigationHelper extends DriverBasedHelper implements INavigationHelper {

    private String baseUrl;

    public NavigationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseUrl = manager.getBaseUrl();
    }

    @Override
    public void openMainPage() {
        driver.get(baseUrl);
    }

    @Override
    public void openTeamPage() {
        pages.mainPage.openMainMenu();
        pages.mainMenuPage.clickTeamLink();
        pages.teamPage.waitForLoad();
    }

    @Override
    public boolean isTeamPageOpened() {
        return (driver.getCurrentUrl().equals(pages.teamPage.url)) ? true : false;
    }

    @Override
    public boolean isTeamPageTitlePresent() {
        return pages.teamPage.isTitlePresent();
    }

    @Override
    public boolean isImageUrlPresentAtTeamPage() {
        return pages.teamPage.isFirstImageUrlPresent();
    }


}
