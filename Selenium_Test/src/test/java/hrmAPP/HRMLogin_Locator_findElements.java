package hrmAPP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HRMLogin_Locator_findElements extends BaseTest{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(2000);
		System.out.println("application URL after login: " + driver.getCurrentUrl());
		
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		
		
		
		//multiple match ------ perform an action on first occurrence
		List<WebElement> all_ele =driver.findElements(By.className("oxd-userdropdown-link"));
		
		
		System.out.println("no of elements having class, value: " + all_ele.size());
		
		
		for (int i = 0; i < all_ele.size(); i++) {
			
			String eleText = all_ele.get(i).getText();
			System.out.println("element text are: " + eleText);
			
			
			if(eleText.equalsIgnoreCase("Logout")) {
				
				all_ele.get(i).click();
				break;
			}
			
		}
		
		
		
		
		Thread.sleep(3000);
		System.out.println("application URL after logout: " + driver.getCurrentUrl());
		
		
		
	}

}
