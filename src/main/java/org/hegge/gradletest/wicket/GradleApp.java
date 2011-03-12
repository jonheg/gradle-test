package org.hegge.gradletest.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class GradleApp extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return GradleHomepage.class;
    }
}
