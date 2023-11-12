package stepDefinationTest1;

import io.cucumber.java.en.Given;
import utilityTest1.BaseClassTest1;

public class Signup extends BaseClassTest1{
	
	@Given("Launch {string}")
	public void launch(String URL) {
	   
		test1launchURL(URL);	
		
	}

}
