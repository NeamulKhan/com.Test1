package stepDefinationTest1;

import homepageActionTest1.HomepageActionTest1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest1.BaseClassTest1;

public class Login extends BaseClassTest1{
	
	HomepageActionTest1 homepageActionTest1 = new HomepageActionTest1();
	
	@When("I click loginLink,enter user name, password and click login button")
	public void i_click_login_link_enter_user_name_password_and_click_login_button() {
	    
		
	}

	@Then("verify user can successfully login")
	public void verify_user_can_successfully_login() {
	    
		
	}



}