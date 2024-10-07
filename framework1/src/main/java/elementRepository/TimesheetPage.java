package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class TimesheetPage {
	GenaralUtilities gu = new GenaralUtilities();

	public TimesheetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	@FindBy(xpath = "//a[text()='Create Timesheet']")
	WebElement createtimesheet;

	@FindBy(xpath = "//input[@class='file-caption-name']")
	WebElement searchanimage;

	@FindBy(xpath = "//button[text()='Generate Playslip']")
	WebElement generateplayslip;

	@FindBy(xpath = "//button[text()='Generate Invoice']")
	WebElement generateInvoice;

	public void createTimesheet() {
		createtimesheet.click();
	}

	public String getToolTipValue() {
		return gu.getAttributeValue(searchanimage, "title");

	}

	public void generatePlayslip() {
		generateplayslip.click();
	}

	public String getAlertWhenClickonGeneratePlayslip(Boolean accept) {
		return gu.ClicksOkonGeneratePlayslip(driver, true);
	}

	public void generateInvoice() {
		generateInvoice.click();
	}

	public String getAlertWhenClickonGenerateInvoice(Boolean accept) {
		return gu.ClicksOkonGeneratePlayslip(driver, true);
	}

	public String getGenerateInvoiceBackgroundColor() {
		return gu.getCssValue(generateInvoice, "background-color");
	}
}
