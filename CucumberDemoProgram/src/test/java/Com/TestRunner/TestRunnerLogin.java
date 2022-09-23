package Com.TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
tags="@Login or @Home",
glue = {"Com.SauceDemo.StepDefinations","Com.set.Browser.SetWebDriver"}, 
plugin = { "html:target/cucumber-html-report1",
		"json:target/cucumber-reports1/cucumber.json",
		"junit:target/cucumber-reports1/cucumber.xml"

}, dryRun=false, monochrome = true)
public class TestRunnerLogin 
{

}
