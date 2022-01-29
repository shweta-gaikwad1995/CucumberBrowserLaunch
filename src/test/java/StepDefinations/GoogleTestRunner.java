package StepDefinations;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", 
glue= {"StepDefinations"}, //package
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports",
		"json:target/cucumber.json",
		"pretty:target/cucmber-pretty.txt",
		"usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml"}

		)
public class GoogleTestRunner {

}


