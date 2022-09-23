package Com.TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
glue = {"Com.SauceDemo.StepDefinations"}, 
plugin = { "html:target/cucumber-html-report1",
		"json:target/cucumber-reports1/cucumber.json",
		"junit:target/cucumber-reports1/cucumber.xml"

},tags="@Home or @Cart", monochrome = true)
public class HomePageRunner {

}
