package com.euromoneyplc.test;

import com.euromoneyplc.app.IApplicationManager;
import com.euromoneyplc.managers.ApplicationManager;
import com.euromoneyplc.managers.NavigationHelper;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Yeahkaterina on 24.02.2016.
 */
public class TestBase {

    protected ApplicationManager app;
    private NavigationHelper navHelper;

    @Before
    public void init() {
        app = new ApplicationManager();
    }

    @After
    public void stop() {
        app.stop();
    }
}
