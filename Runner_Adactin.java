package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	
@CucumberOptions(
features = "featurefiles/Adactin.feature", 
glue = "stepdefinitions" ,

plugin =  {"html:target/Myreports/adactin03.html",
		 },
publish = true)

	public class Runner_Adactin {
}

