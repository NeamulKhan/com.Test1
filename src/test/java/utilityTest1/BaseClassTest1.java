package utilityTest1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassTest1 {
	
	public static Properties test1_prop;
	public static WebDriver driver;

  public BaseClassTest1(){
	  	
				
		try {
			FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\Test1\\config\\com.Test1.Properties");	
				
			test1_prop = new Properties();
			test1_prop.load(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		}
		
		public void test1browserinit() {
			
		String browser = test1_prop.getProperty("Browser1");
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDriverTest1\\chromedriver.exe");	
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataTest1.implicitywait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataTest1.pageLoadwait));
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			
			}
			
		}
		public static void test1launchURL(String URL) {
			
			driver.get(test1_prop.getProperty("URL"));
		}
	

  }


