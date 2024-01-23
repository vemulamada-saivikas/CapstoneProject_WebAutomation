package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMLogin_Locator_Link_PartialLinkText3 {
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(3000);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		//driver.findElement(By.tagName("p")).click();	///click on first element
		
		
		Thread.sleep(3000);
		
		driver.findElements(By.tagName("p")).get(2).click();
		
//		for (int i = 0; i < 4; i++) {
//			String textValue = driver.findElements(By.tagName("p")).get(i).getText();
//		
//			System.out.println(textValue);
//		}
//		
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
