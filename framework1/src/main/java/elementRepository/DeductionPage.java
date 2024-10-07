package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class DeductionPage {
	GenaralUtilities gu = new GenaralUtilities();

	public DeductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Add Deduction']")
	WebElement adddeduction;

	// @FindBy(id="deduction-worker_id")
	// WebElement worker;

	@FindBy(id = "deduction-type")
	WebElement type;

	@FindBy(id = "deduction-amount")
	WebElement amouNT;

	@FindBy(id = "deduction-effective_from")
	WebElement effectiveFrom;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	public void clickOnAddDeduction() {
		adddeduction.click();
	}
	// public String selectValueFromWorkerDropDown()
	// {
	// return gu.getSelectedValueFromDropDown(worker, "Dennis Benny");

//}
	public String selectValueFromTypeDropDown() {
		return gu.getSelectedValueFromDropDown(type, "CRB");

	}

	public void inputAmount() {
		amouNT.sendKeys("2000");

	}

	public void inputEffectiveFrom() {
		effectiveFrom.sendKeys("10-09-2024");
	}

	public void clickOnSaveButton() {
		save.click();
	}

}
