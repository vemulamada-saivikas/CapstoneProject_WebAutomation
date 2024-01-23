package hrmAPP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HRMLogin_Locator_Link_PartialLinkText2 extends BaseTest{
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		Thread.sleep(3000);

		
		driver.findElement(By.linkText("Forgot your password? ")).click();
		
		
		
	}

}
