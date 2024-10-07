package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class DashboardPage {
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	GenaralUtilities gu = new GenaralUtilities();

	WebDriver driver;
	// By payrollApplicationheading=By.xpath("//h1[text()='Payroll Application']");
	@FindBy(xpath = "//h1[text()='Payroll Application']")
	WebElement payrollApplicationheading;

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement worker;

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clients;

	@FindBy(xpath = "//a[text()='TimeSheet']")
	WebElement timesheet;

	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement deduction;

	public String getTextFromHeading() {
		return gu.getElementText(payrollApplicationheading);

	}

	public WorkerPage clickOnWorker() {
		worker.click();
		return new WorkerPage(driver);
	}

	public ClientsPage clickOnClients() {
		clients.click();
		return new ClientsPage(driver);
	}

	public TimesheetPage clickOnTimesheet() {
		timesheet.click();
		return new TimesheetPage(driver);// page chaining
	}

	public DeductionPage clickOnDeduction() {
		deduction.click();
		return new DeductionPage(driver);
	}

}
