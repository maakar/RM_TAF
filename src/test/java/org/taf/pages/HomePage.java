package org.taf.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage extends AbstractBasePage {

	private static final String DEFAULT_URL = "/index.php";

	public HeaderElement headerElement() {
		return new HeaderElement();
	}

	public final SelenideElement sliderRow() {
		return $("#slider_row");
	}

	public final SelenideElement homePageTabs() {
		return $("#home-page-tabs>li");
	}

	public final SelenideElement tabContent() {
		return $(".tab-content");
	}

	public final ElementsCollection productLIst() {
		return $$("#homefeatured > li");
	}

	public final SelenideElement productPreviewPicture() {
		return $("[class='left-block']");
	}

	public final SelenideElement productNameInList() {
		return $("[class='product-name']");
	}

	public final SelenideElement productPriceInList() {
		return $("[class='price product-price']");
	}

	public final SelenideElement productPriceOldInList() {
		return $("[class='old-price product-price']");
	}

	public final SelenideElement pricePercentReduction() {
		return $("[class='price-percent-reduction']");
	}

	public final SelenideElement clearFix() {
		return $(".clearfix");
	}

	@Override
	public String getPageUrl() {
		return baseUrl + DEFAULT_URL;
	}
}
