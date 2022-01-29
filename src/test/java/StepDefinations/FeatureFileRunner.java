package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
strict=true,
glue= {"StepDefinations"},
monochrome=true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",	//JUnit Report
		"json:target/JSONReports/report.json",				//JsonReports
		"html:target/HtmlReports",							//Html report
		"json:target/cucumber.json",//Cucumber Html Report
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		       }  
		
		


		)

public class FeatureFileRunner {
	 
}
