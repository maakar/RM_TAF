package org.taf.pages;

import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.taf.exceptions.TestExecutionException;

import java.lang.reflect.Field;

import static com.codeborne.selenide.Configuration.baseUrl;

public abstract class BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasePage.class);

    public void click(String elementName) {
        getElementByName(elementName).click();
    }

    public SelenideElement getElementByName(String elementName) {
        Class<?> elementClass = this.getClass();
        while (elementClass != BasePage.class) {
            try {
                Field requestedField = elementClass.getDeclaredField(elementName);
                requestedField.setAccessible(true);
                try {
                    return (SelenideElement) requestedField.get(this);
                } catch (IllegalAccessException e) {
                    throw new TestExecutionException(e);
                }
            } catch (final NoSuchFieldException e) {
                LOGGER.debug("Required field not found", e);
            }
            elementClass = elementClass.getSuperclass();
        }
        throw new TestExecutionException(String.format("Element with name '%s' was not found on the %s page",
                elementName, this.getClass().getName()));
    }



}
