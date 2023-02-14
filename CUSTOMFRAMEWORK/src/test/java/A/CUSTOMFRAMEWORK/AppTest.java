package A.CUSTOMFRAMEWORK;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
				tags = "@smoke",
				glue = "steps_definations",
				plugin = {"pretty","html:target/report.html"}, monochrome = true) //glue is keyword of cucumber option and we need to give path of step difination package

public class AppTest {
   
}
