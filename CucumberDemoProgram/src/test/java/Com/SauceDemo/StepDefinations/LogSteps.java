package Com.SauceDemo.StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;

import Com.SauceDemo.Pom.HomPagePom;
import Com.SauceDemo.Pom.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogSteps {
	public WebDriver driver;
	LoginPage lg;
	HomPagePom hp;

	@Given("load browser and hit the")
	public void load_browser_and_hit_the() {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@When("enter the Username and password and loginclick")
	public void enter_the_username_and_password_and_loginclick() {
		lg=new LoginPage(driver);
		lg.enterUsername();
		lg.enterPassword();
		lg.clickLogin();
	}
	@And("click on the product")
	public void click_on_the_product() throws InterruptedException {
		hp=new HomPagePom(driver);
		hp.clickOnProduct();
	}

	@Then("product details should open and Click Add to Cart button")
	public void product_details_should_open_and_click_add_to_cart_button() throws InterruptedException {
		
		hp.clickAddToCart();
	}

	@And("nevigate backward")
	public void nevigate_backward() throws InterruptedException {
		
		hp.backToHomePage();
	}

	@Then("back to home page and Check cart")
	public void back_to_home_page_and_check_cart() {
		if (driver.getTitle().equalsIgnoreCase("Swag Labs")) {
			System.out.println("You Are On Home Page");
		}
	}

}
