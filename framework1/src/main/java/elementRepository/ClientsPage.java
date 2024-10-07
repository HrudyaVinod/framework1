package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenaralUtilities;

public class ClientsPage {
	GenaralUtilities gu = new GenaralUtilities();

	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	WebDriver driver;
	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClient;
	@FindBy(id = "client-require_po")
	WebElement requirePo;

	public void clickOnCreateClient() {
		createClient.click();
	}

	public void clickOnRequiredPOCheckBox()

	{
		requirePo.click();
	}

	public Boolean selectCheckbox() {
		return gu.isSelectedCheckBox(requirePo);
	}
}
