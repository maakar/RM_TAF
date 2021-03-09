package org.taf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public abstract class AbstractPageWithHeader extends AbstractBasePage {

    private final SelenideElement banner = $("#header .banner");

    private final SelenideElement navBar = $(".nav .row");

    private final SelenideElement contactLinkNavBar = $("#contact-link");

    private final SelenideElement signInButton = $(".header_user_info");

    private final SelenideElement headerLogo = $("#header_logo");

    private final SelenideElement searchBoxTop = $("#searchbox");

    private final SelenideElement shoppingCartButton = $(".shopping_cart > a:nth-child(1)");

    private final SelenideElement topBlockMenu = $("#block_top_menu>ul");

    private final SelenideElement topBlockMenuButtons = $("#block_top_menu > ul > li");

}
