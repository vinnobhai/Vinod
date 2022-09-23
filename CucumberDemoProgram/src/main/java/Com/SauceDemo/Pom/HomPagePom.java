package Com.SauceDemo.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomPagePom {
   
	private WebDriver driver;
	
	public HomPagePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")private WebElement product;
	@FindBy(xpath="//button[text()='Add to cart']")private WebElement addToChart;
	
	public void clickOnProduct() throws InterruptedException {
		Thread.sleep(3000);
		product.click();
	}
	public void clickAddToCart() throws InterruptedException {
		Thread.sleep(3000);
		addToChart.click();
	}
	public void backToHomePage() throws InterruptedException{
		Thread.sleep(3000);
	//	driver.navigate().back();
	}
	
}
