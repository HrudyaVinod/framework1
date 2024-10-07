package utilities;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class GenaralUtilities {
	public String getElementText(WebElement element)// to get element text
	{
		String text = element.getText();
		return text;
	}

	public String getSelectedValueFromDropDown(WebElement element, String valueToSelect) {
		Select select = new Select(element);
		select.selectByValue(valueToSelect);
		WebElement dropdown = select.getFirstSelectedOption();
		String text = dropdown.getText();
		return text;
	}

	public String getCssValue(WebElement element, String cssProperty) {
		// String cssValue=element.getCssValue(cssProperty);
		// return cssValue;
		return element.getCssValue(cssProperty);
	}

	public Boolean isSelectedCheckBox(WebElement element) {
		Boolean value = element.isSelected();
		return value;
	}

	public String getAttributeValue(WebElement element, String Locator) {
		return element.getAttribute(Locator);

	}

	public String ClicksOkonGeneratePlayslip(WebDriver driver, Boolean accept) {

		String alertText = driver.switchTo().alert().getText();
		if (accept) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
		return alertText;

	}
}
