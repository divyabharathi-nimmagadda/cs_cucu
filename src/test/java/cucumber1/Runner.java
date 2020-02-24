package cucumber1;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(plugin="json:register_report.json")
@RunWith(Cucumber.class)
public class Runner {
	
}
