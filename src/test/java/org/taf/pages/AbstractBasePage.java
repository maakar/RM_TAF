package org.taf.pages;

import com.codeborne.selenide.SelenideElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.taf.exceptions.TestExecutionException;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractBasePage implements PageWithUrl {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBasePage.class);

	public void click(String elementName) {
		getElementByName(elementName).click();
	}

	public SelenideElement getElementByName(String elementName) {
		Class<?> elementClass = this.getClass();
		while (elementClass != AbstractBasePage.class) {
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

	public List<SelenideElement> resolveAllElements() {
		List<SelenideElement> listOfElements = new LinkedList<>();
		Arrays.stream(this.getClass().getDeclaredFields()).filter(it -> it.getType() == SelenideElement.class)
				.collect(Collectors.toList()).forEach(it -> {
					SelenideElement element = getElementByName(it.getName());
					listOfElements.add(element);
				});
		return listOfElements;
	}

}
