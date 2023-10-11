package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",
				glue= {"org.opencart.stepdefs"},
				/*for reporting using plugin html report and
				location and json report location*/
				plugin= {"pretty","html:target/cucumber-reports",
						"json:target/cucumber-reports"},
				//for nice and aligned for report and output
				//publish the report in cloud
				monochrome=true,publish=true)

//AbstractTestNGCucumberTests for parallel execution
public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
