package org.taf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends AbstractPageWithHeader {


    private static final String DEFAULT_URL = "/index.php";

    private final SelenideElement sliderRow = $("#slider_row");

    private final SelenideElement homePageTabs = $("#home-page-tabs>li");

    private final SelenideElement tabContent = $(".tab-content");

    private final SelenideElement clearFix = $(".clearfix");

    @Override
    public String getPageUrl() {
        return baseUrl + DEFAULT_URL;
    }
}
