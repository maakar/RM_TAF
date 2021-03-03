package org.taf.tests.homepagetests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.taf.pages.HomePage;
import org.taf.steps.CommonTestSteps;
import org.taf.tests.BaseTest;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class HomePageNavigationTest extends BaseTest {

	CommonTestSteps commonTestSteps = new CommonTestSteps();
	HomePage homePage = new HomePage();

	private final String contactLinkNavBar = "contactLinkNavBar";
	private final String signInButton = "signInButton";

	@Test
	public void checkHomePageUrl() {
		openHomePageAndCheckUrl();
	}

	@Test
	public void checkAllElementsAreVisibleOnHomePage() {
		openHomePageAndCheckUrl();
		commonTestSteps.checkAllElementsAreVisibleOnThePage(homePage);
	}

	@Test
	public void checkTransitionOnLogoClick() {
		openHomePageAndCheckUrl();
		homePage.click("headerLogo");
		assertEquals(homePage.getPageUrl(), url());
	}

	@Test
	public void checkNavBarTexts() {
		openHomePageAndCheckUrl();
		commonTestSteps.checkIfElementHasText(homePage, contactLinkNavBar, "Contact us");
		commonTestSteps.checkIfElementHasText(homePage, signInButton, "Sign in");
	}

	@Test
	public void checkNavBarLinks() {
		openHomePageAndCheckUrl();
		commonTestSteps.checkIfElementIsVisibleOnThePage(homePage, "navBar");
		commonTestSteps.checkLinkOfTheElement(homePage, contactLinkNavBar,
				"http://automationpractice.com/index.php?controller=contact");
		commonTestSteps.checkLinkOfTheElement(homePage, signInButton,
				"http://automationpractice.com/index.php?controller=my-account");
	}

	private void openHomePageAndCheckUrl() {
		open(baseUrl);
		assertEquals(homePage.getPageUrl(), url());
	}

}
