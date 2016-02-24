package com.euromoneyplc.app;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public interface INavigationHelper {

    void openMainPage();

    void openTeamPage();

    boolean isTeamPageOpened();

    boolean isTeamPageTitlePresent();

    boolean isImageUrlPresentAtTeamPage();
}
