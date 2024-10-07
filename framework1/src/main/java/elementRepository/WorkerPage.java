package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GenaralUtilities;

public class WorkerPage {
	GenaralUtilities gu = new GenaralUtilities();

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createworker;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	@FindBy(id = "worker-title")
	WebElement titleDropdown;

	public void clickCreateWorker() {
		createworker.click();
	}

	public String selectValueFromTitleDropDown() {
		return gu.getSelectedValueFromDropDown(titleDropdown, "Ms");
	}

	public String getSearchButtonFontSize() {
		return gu.getCssValue(searchButton, "font-size");
	}

	public String getTextFromSearchButton() {
		return gu.getElementText(searchButton);
	}

}
