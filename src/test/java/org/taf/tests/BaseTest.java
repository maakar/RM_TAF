package org.taf.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;

public abstract class BaseTest {

    @Rule
    public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);
    @Rule
    public ScreenShooter screenShooter = ScreenShooter.failedTests();

    @Before
    public void confidurationSetup() {
        Configuration.baseUrl = "http://automationpractice.com";
    }


}
