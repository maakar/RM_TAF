package org.taf.pages;

import static com.codeborne.selenide.Configuration.baseUrl;

public class AuthentificationPage extends AbstractPageWithHeader {

    private static final String DEFAULT_URL = "/index.php?controller=authentication&back=my-account";

    @Override
    public String getPageUrl() {
        return baseUrl + DEFAULT_URL;
    }

}
