package Com.SauceDemo.StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.SauceDemo.Pom.HomPagePom;
import Com.SauceDemo.Pom.LoginPage_Pom;
import Com.TestRunner.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
//	WebDriver driver;
//	LoginPage_Pom lg;
//	HomPagePom hp;
//
//	@Given("load browser and hit the url")
//	public void load_browser_and_hit_the_url() {
//		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		lg = new LoginPage_Pom(driver);
//		hp = new HomPagePom(driver);
//	}
//
//	@When("^enter the Username (.*) and password (.*)$")
//	public void enter_the_username_and_password(String username, String password) {
//		lg.enterUsername(username);
//		lg.enterPassword(password);
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//		lg.clickLogin();
//	}
//
//	@Then("validate the home page")
//	public void validate_the_home_page() {
//		if (driver.getTitle().equalsIgnoreCase("Swag Labs")) {
//			System.out.println("You Are On Home Page");
//		}
//	}
//	
//
//	@When("click on the product")
//
//	public void click_on_the_product() {
//		
//		hp.clickOnProduct();
//	}
//	@Then("product details should open and Click Add to Cart button")
//	public void product_details_should_open_and_click_add_to_cart_button() {
//		hp.clickAddToCart();
//	}
//
//	@And("nevigate backward")
//	public void nevigate_backward() {
//		hp.backToHomePage();
//	}
//
//	@Then("back to home page and Check cart")
//	public void back_to_home_page_and_check_cart() {
//		if (driver.getTitle().equalsIgnoreCase("Swag Labs")) {
//			System.out.println("You Are On Home Page");
//		}
//	}
}
