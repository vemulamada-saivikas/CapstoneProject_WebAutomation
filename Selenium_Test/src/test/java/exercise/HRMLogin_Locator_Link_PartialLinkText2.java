package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMLogin_Locator_Link_PartialLinkText2 {
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Mobiles")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
