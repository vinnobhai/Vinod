package Com.SauceDemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")private WebElement userName;
	@FindBy(id="password")private WebElement passWord;
	@FindBy(id="login-button")private WebElement login;
	public void enterUsername() {
		userName.sendKeys("standard_user");
	}
	public void enterPassword() {
		passWord.sendKeys("secret_sauce");
	}
	public void clickLogin() {
		login.click();
	}
}
