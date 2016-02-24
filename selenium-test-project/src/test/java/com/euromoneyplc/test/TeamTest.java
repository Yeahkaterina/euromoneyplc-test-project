package com.euromoneyplc.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class TeamTest extends TestBase {

    @Test
    public void testq(){
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openTeamPage();

        Assert.assertTrue("Team page is not open", app.getNavigationHelper().isTeamPageOpened());
        Assert.assertTrue("No title on the team page", app.getNavigationHelper().isTeamPageTitlePresent());
    }

    @Test
    public void testq1(){
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openTeamPage();

        Assert.assertTrue("URL of first image isn't present", app.getNavigationHelper().isImageUrlPresentAtTeamPage());
    }
}
