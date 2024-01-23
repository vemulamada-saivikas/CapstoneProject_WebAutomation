package AmazonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test1  extends BaseTest {
	
	@Test
	public void amazontest() throws Exception {
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.cssSelector("input[name='field-keywords']"));
		
		           a.click();
		Thread.sleep(2000);
		a.sendKeys("Iphone 15 pro max");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
