package Com.TestRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	 WebDriver driver;
  public  void getDriver() {
	  System.setProperty("webdriver.chrome.driver",
					"F:\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  
  }
}
