package Com.SauceDemo.Pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class CartPage_Pom 
{
	private WebDriver driver;
	public CartPage_Pom(WebDriver driver) {
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
		driver.navigate().back();
	}
	@FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement Cart;
	@FindBy(xpath="//button[text()='Remove']")private WebElement remove;
	@FindBy(xpath="//button[text()='Add to cart']")private List<WebElement> Products;

	public void clickCart() {
		Cart.click();
	}
	public void clickRemove() {
		remove.click();
	}
	public void backToHomePage() {
	driver.navigate().back();
	}
	public void addMultipleProd() {
		for(WebElement prod:Products) {
			prod.click();
		}
    }

}
