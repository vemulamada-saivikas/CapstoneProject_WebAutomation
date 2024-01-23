package hrmAPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HRMLogin_Locator extends BaseTest{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(2000);
		System.out.println("application URL: " + driver.getCurrentUrl());
		
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		
		
		
		//multiple match ------ perform an action on first occurrence
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		
		Thread.sleep(3000);
		
		
	}

}
