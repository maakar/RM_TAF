package org.taf.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.taf.pages.AbstractBasePage;

public class CommonTestSteps {


    public void checkIfElementIsVisibleOnThePage(AbstractBasePage page, String elementName) {
        resolveElementOnPage(page, elementName).should(Condition.visible);
    }

    public void checkIfElementHasText(AbstractBasePage page, String elementName, String text) {
        resolveElementOnPage(page, elementName).should(Condition.visible).shouldHave(Condition.text(text));
    }

    public void checkLinkOfTheElement(AbstractBasePage page, String elementName, String expectedLink) {
        resolveElementOnPage(page, elementName).$("a").shouldHave(Condition.href(expectedLink));
    }

    public void checkAllElementsAreVisibleOnThePage(AbstractBasePage page) {
        page.resolveAllElements().forEach(element -> element.should(Condition.visible));
    }



    private SelenideElement resolveElementOnPage(AbstractBasePage page, String elementName) {
        return page.getElementByName(elementName);
    }

}
