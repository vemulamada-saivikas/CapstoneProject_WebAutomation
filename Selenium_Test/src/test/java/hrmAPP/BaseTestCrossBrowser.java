package hrmAPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constants;

public class BaseTestCrossBrowser {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		
		System.out.println("fetch value form constant file: " + Constants.browser);
		
//		Constants.browser = "demo";

		System.out.println("=====================" + Constants.browser);
		
		
		String browserDetails = Constants.browser;
		
		
		if(browserDetails.equalsIgnoreCase("CHROME")) {
			
			System.out.println("launching chrome browser");
			System.out.println("launching an application on chrome browser");
			
			System.out.println("launching app on chrome browser -----using TestNG");
			driver = new ChromeDriver();
			
		}
		
		else if(browserDetails.equalsIgnoreCase("edge")) {
			
			System.out.println("launching edge browser");
			System.out.println("launching an application on edge browser");
			
			driver = new EdgeDriver();
		}
		
		else if(browserDetails.equalsIgnoreCase("firefox")) {
			
			System.out.println("launching firefox browser");
			System.out.println("launching an application on firefox browser");
			
			driver = new FirefoxDriver();
		}
		
		
		else {
			driver = new ChromeDriver();
			System.out.println("launching default browser, CHROME");
		}
		
		
		
		
		
		System.out.println("=========================application details================================");
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(5000);
		driver.close();
		System.out.println("closing an app");

	}

}
