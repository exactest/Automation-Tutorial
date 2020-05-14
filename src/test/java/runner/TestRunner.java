package runner;


import cucumber.api.testng.AbstractTestNGCucumberTests;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			strict = true,
	        features = {"src/test/resources/features"},	       
	        glue="ie.exactest.tests",
	        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-html-report/ExactestIE.html"}			
			,tags = {
					"@TS001_DOMAINS"
					}
		)
			

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
		public static void reportSetup(){
			Reporter.loadXMLConfig(new File("src/test/resources/extent-config"));
	}

}
