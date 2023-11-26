package testRunnerTest1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilityTest1.BaseClassTest1;


@CucumberOptions(features= {"src/test/resources/FeatureFolderTest1"},
plugin={"json:target/cucumber.json"},

glue="stepDefinationTest1", tags= "@SignupTest1 and @LoginTest1" 

		)

public class TestRunnerTest1 extends AbstractTestNGCucumberTests {

	@BeforeTest
	 
	 public void setup()throws IOException {
		 
		BaseClassTest1 test = new BaseClassTest1();
		 
		 test.test1browserinit();
	 }
		 
		 @AfterTest
		 
		 public void closerURL() throws IOException, Exception{
			 
			 BaseClassTest1 test = new BaseClassTest1();
			 
			 Thread.sleep(5000);
			 
			 test.driver.quit();
			 
			
		 
	 }
	 


}

	
	

