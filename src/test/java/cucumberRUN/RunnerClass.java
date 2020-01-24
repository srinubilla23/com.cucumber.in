package cucumberRUN;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(features={"E:\\EclipseProject\\com.cucumber.in\\Features\\cucumber.feature"},
glue={"stepdefination"},
plugin={"pretty",  "html:target/cucumber-html-report"})

public class RunnerClass 
{
	
}
