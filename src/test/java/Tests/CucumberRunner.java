package Tests;

import org.testng.annotations.Listeners;

import Listeners.Listener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(Listener.class)
@CucumberOptions(
		plugin= {"html:target/report.html","pretty"},
		features="src/test/java/Features",
		glue="StepDefinations")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
