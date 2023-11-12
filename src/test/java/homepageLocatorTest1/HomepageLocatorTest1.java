package homepageLocatorTest1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest1.BaseClassTest1;

public class HomepageLocatorTest1 extends BaseClassTest1{
	
	public HomepageLocatorTest1() {
		
	PageFactory.initElements(driver,this);	
		
	}
	
	@FindBy(id="signin2")
	public WebElement signupLink;
}
