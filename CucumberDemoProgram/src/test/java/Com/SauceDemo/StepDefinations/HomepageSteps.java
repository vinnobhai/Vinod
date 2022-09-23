package Com.SauceDemo.StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.SauceDemo.Pom.HomPagePom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {
//	WebDriver driver;
//	HomPagePom hp ;
//	
//@When("click on the product")
//	
//	public void click_on_the_product() {
//		 System.setProperty("webdriver.chrome.driver",
//					"F:\\Drivers\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/"); 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//		hp =new HomPagePom(driver);
//	    hp.clickOnProduct();
//	}
//	@Then("product details should open and Click Add to Cart button")
//	public void product_details_should_open_and_click_add_to_cart_button() {
//		 hp.clickAddToCart();
//	}
//
//	@And("nevigate backward")
//	public void nevigate_backward() {
//	   hp.backToHomePage();
//	}
//
//	@Then("back to home page and Check cart")
//	public void back_to_home_page_and_check_cart() {
//	    if(driver.getTitle().equalsIgnoreCase("Swag Labs")) {
//	    	System.out.println("You Are On Home Page");
//	    }
//	}
}
