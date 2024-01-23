
package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleListboxExample2{
    
	

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.out.println("launching app on chrome browser -----using TestNG");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() throws Exception {

		Thread.sleep(5000);
		driver.close();
		System.out.println("closing an app");

	}
    
    @Test
    public void verifyCountryListboxTest() throws Exception {
        
        
        
        driver.findElement(By.cssSelector("option[value='India']")).click();
        
        
        
        
    }
    
    
    @Test(priority = -100)
    public void raju() {
    	System.out.println("hi");
    }
    
    
    @Test(priority = 10)
    public void raju1() {
    	System.out.println("hello");
    }
    
    
    
    @Test
    public void verifyCarListboxTest() throws Exception {
        
        driver.findElement(By.cssSelector("option[value='Singapore']")).click();
        
        
    }


}
