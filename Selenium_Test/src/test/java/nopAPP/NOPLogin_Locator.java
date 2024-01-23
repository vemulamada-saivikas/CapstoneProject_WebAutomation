package nopAPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NOPLogin_Locator extends BaseTest{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		//Name
		WebElement txt_email = driver.findElement(By.name("Email"));
		
		Thread.sleep(1000);
		txt_email.clear();
		Thread.sleep(3000);
		
		txt_email.sendKeys("genpact@yourstore.com");
		
		
		
		//click on checkbox 
		//name
//		WebElement chk_rem = driver.findElement(By.name("RememberMe"));
//		chk_rem.click();
		
		
		//ID
		WebElement chk_rem = driver.findElement(By.id("RememberMe"));
		chk_rem.click();
		
		
		

		
		
		
		//click on login button
		//Tagname
		driver.findElement(By.tagName("button")).click();;
		
		
		
		
	}

}
