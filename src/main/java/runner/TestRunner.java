package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		//step defination file
			glue ="stepdefination",	
			// features file
			features="C:\\Users\\Admin\\eclipse-workspace\\BDDAutomationFrameworkBatchOct\\src\\test\\java\\features\\LoginPage.feature"
		)



public class TestRunner {

}
