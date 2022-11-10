package cucumberOptions;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		
		features = "src/test/java/featureLayer",
		glue = "stepDefinations",
		//dryRun=true,
		monochrome=true
		
		
		
)

public class TestRunner extends AbstractTestNGCucumberTests
{}

