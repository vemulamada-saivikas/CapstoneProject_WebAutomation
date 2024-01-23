package nopCommExample_Failure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseTest {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		
		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}
	
	@AfterTest
	public void teardown() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("closing an app");
		
		
	}


	
}
