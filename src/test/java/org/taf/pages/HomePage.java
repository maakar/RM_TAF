package org.taf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends AbstractBasePage {


    private static final String DEFAULT_URL = "/index.php";

    private final SelenideElement banner = $("#header .banner");

    private final SelenideElement navBar = $(".nav .row");

    private final SelenideElement contactLinkNavBar = $("#contact-link");

    private final SelenideElement signInButton = $(".header_user_info");

    private final SelenideElement headerLogo = $("#header_logo");

    private final SelenideElement searchBoxTop = $("#searchbox");

    private final SelenideElement shoppingCartButton = $(".shopping_cart > a:nth-child(1)");

    private final SelenideElement topBlockMenu = $("#block_top_menu>ul");

    private final SelenideElement topBlockMenuButtons = $("#block_top_menu > ul > li");

    private final SelenideElement sliderRow = $("#slider_row");

    private final SelenideElement homePageTabs = $("#home-page-tabs>li");

    private final SelenideElement tabContent = $(".tab-content");

    private final SelenideElement clearFix = $(".clearfix");

    @Override
    public String getPageUrl() {
        return baseUrl + DEFAULT_URL;
    }
}
