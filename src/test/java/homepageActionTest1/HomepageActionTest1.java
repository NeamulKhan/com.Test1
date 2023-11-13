package homepageActionTest1;

import homepageLocatorTest1.HomepageLocatorTest1;
import utilityTest1.BaseClassTest1;

public class HomepageActionTest1 extends BaseClassTest1{
	
	HomepageLocatorTest1 homepageLocatorTest1 = new HomepageLocatorTest1();


	public void click_signupLink_enter_user_name_password_and_click_signup_button() throws Exception{
		
		homepageLocatorTest1.signupLink.click();
		Thread.sleep(3000);
	}
	}
