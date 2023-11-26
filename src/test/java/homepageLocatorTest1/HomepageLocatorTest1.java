package homepageLocatorTest1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest1.BaseClassTest1;

public class HomepageLocatorTest1 extends BaseClassTest1{
	
	public HomepageLocatorTest1() {
		
	PageFactory.initElements(driver,this);	
		
	}
	

	@FindBy(id="login2")
	public WebElement loginLink;
	
	@FindBy (id="loginusername")
	public WebElement username1;
	
	@FindBy (id="loginpassword")
	public WebElement password1;
	
	@FindBy (xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public WebElement loginButton;

	@FindBy(id="signin2")
	public WebElement signupLink;
	
	@FindBy (id="sign-username")
	public WebElement username;
	
	@FindBy(id="sign-password")
	public WebElement password;
	
	@FindBy (xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	public WebElement signupButton;

	
	
}
