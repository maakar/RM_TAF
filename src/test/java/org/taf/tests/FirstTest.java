package org.taf.tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.taf.pages.HomePage;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class FirstTest extends BaseTest {


    @Test
    public void loginTest() {

        HomePage homePage = new HomePage();

        open(baseUrl);
        assertEquals(homePage.getPageUrl(), url());
        homePage.getElementByName("signInButton").shouldHave(Condition.text("Sign in"));
        homePage.click("signInButton");

    }
}
