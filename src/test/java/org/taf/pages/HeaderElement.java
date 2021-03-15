package org.taf.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElement extends AbstractBasePage {

	public final SelenideElement banner() {
		return $("#header .banner");
	}

	public final SelenideElement navBar() {
		return $(".nav .row");
	}

	public final SelenideElement contactLinkNavBar() {
		return $("#contact-link");
	}

	public final SelenideElement signInButton() {
		return $(".header_user_info");
	}

	public final SelenideElement headerLogo() {
		return $("#header_logo");
	}

	public final SelenideElement searchBoxTop() {
		return $("#searchbox");
	}

	public final SelenideElement shoppingCartButton() {
		return $(".shopping_cart > a:nth-child(1)");
	}

	public final SelenideElement topBlockMenu() {
		return $("#block_top_menu>ul");
	}

	public final SelenideElement topBlockMenuButtons() {
		return $("#block_top_menu > ul > li");
	}

	@Override
	public String getPageUrl() {
		return null;
	}
}
