package stepDefinationTest1;

import homepageActionTest1.HomepageActionTest1;

import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest1.BaseClassTest1;

public class Login extends BaseClassTest1{
	
	HomepageActionTest1 homepageActionTest1 = new HomepageActionTest1();



	@Given("Launch {string}")
	public void launch(String URL) {
	   
		test1launchURL(URL);	
		
	}	
	

	@When("I click loginLink, enter user name, password and click login button")
	public void click_login_link_enter_user_name_password_and_click_login_button() throws Exception {
   
		homepageActionTest1.click_loginLink_enter_user_name_password_and_click_login_button();
		
}

	@Then("verufy user can successfully log in")
	public void verufy_user_can_successfully_log_in() {
    
		
}

	


}
