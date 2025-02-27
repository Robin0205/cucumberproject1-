package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/resources/features/NLogin.feature",
			glue={"stepdefination","apphooks"},
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:test-output"}	
)

public class Myrunnertest {

}
