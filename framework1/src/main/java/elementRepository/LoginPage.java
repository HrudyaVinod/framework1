package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(id = "loginform-username")
	WebElement userName;

	@FindBy(id = "loginform-password")
	WebElement passWord;

	@FindBy(name = "login-button")
	WebElement loginButton;

	public void inputUserName(String username) {

		userName.sendKeys(username);
	}

	public void inputPassword(String password) {

		passWord.sendKeys(password);

	}

	public DashboardPage clickLoginButton() {// page redirection

		loginButton.click();
		return new DashboardPage(driver);
	}

}
