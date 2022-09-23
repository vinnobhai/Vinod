package Com.SauceDemo.StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.SauceDemo.Pom.CartPage_Pom;
import Com.SauceDemo.Pom.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps {
	CartPage_Pom cp ;
	LoginPage lg;
	WebDriver driver;
	
	@Given("load browser and hit the url on browser")
	public void load_browser_and_hit_the_url_on_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@When("enter the Username and password and login click")
	public void enter_the_username_and_password_and_login_click() {
		lg=new LoginPage(driver);
		lg.enterUsername();
		lg.enterPassword();
		lg.clickLogin();
	}
	@And("we click on cart")
	public void we_click_on_cart() throws InterruptedException {
		cp =new CartPage_Pom(driver);
		cp.clickOnProduct();
		cp.clickAddToCart();
		cp.clickCart();
	}

	@Then("click on the remove button")
	public void click_on_the_remove_button() {
	    cp.clickRemove();
	}

	@And("back to Home Page")
	public void back_to_home_page() {
	 cp.backToHomePage();
	}

	@Then("check the no of products present on the homepage")
	public void check_the_no_of_products_present_on_the_homepage() {
	    cp.addMultipleProd();
	}
}
