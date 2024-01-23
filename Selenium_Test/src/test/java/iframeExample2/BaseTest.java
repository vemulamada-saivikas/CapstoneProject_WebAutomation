package iframeExample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(5000);
		driver.close();
		System.out.println("closing an app");

	}

}
