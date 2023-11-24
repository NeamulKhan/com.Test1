package stepDefinationTest1;

import homepageActionTest1.HomepageActionTest1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilityTest1.BaseClassTest1;

public class Signup extends BaseClassTest1{
	
	HomepageActionTest1 homepageActionTest1 = new HomepageActionTest1();
	
	@Given("Launch {string}")
	public void launch(String URL) {
	   
		test1launchURL(URL);	
		
	}
	@When("I click signupLink, enter user name, password and click signup button")
	public void i_click_signup_link_enter_user_name_password_and_click_signup_button() throws Exception {
	   
		 homepageActionTest1.;
	}
}
