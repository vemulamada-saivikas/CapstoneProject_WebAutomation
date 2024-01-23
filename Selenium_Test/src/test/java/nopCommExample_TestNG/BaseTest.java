package nopCommExample_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.Before;

//JUNIT ----- Before, BeforeClass
//TestNG ----- BeforeSuite, BeforeTest, BeforeClass, BeforeMethod



public class BaseTest {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		
		System.out.println("launching app on chrome browser -----using TestNG");
		
		
//		WebDriver 
		
		//CrossBrowserTesting   ----- chrome/edge/firefox/safari
		
//		SafariDriver driver = new SafariDriver();
		
//		WebDriver driver = new EdgeDriver();				//driver instance has access to almost all the methods of WebDriver
		driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}
	
	@AfterTest
	public void teardown() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("closing an app");
		
		
	}


	
}
