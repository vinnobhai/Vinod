package Com.Set.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWebDriver 
{
	private static WebDriver driver;
	
	private SetWebDriver(){
		
	}
	private static SetWebDriver instance = new SetWebDriver();
	public static void setDriver(){
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver.exe");
 
		driver = new ChromeDriver();
	}
	public WebDriver getDriver()
	{
		if(driver==null) {
			setDriver();
		}
	return driver;
	
	}

}
