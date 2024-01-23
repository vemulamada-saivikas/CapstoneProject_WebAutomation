
package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleListboxExample {
    
    
	
	
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
        
        
        //Select ----- to handle listbox/dropdown
                
        WebElement countryList = driver.findElement(By.cssSelector("[name='FromLB']"));
            
        //Create an object of Select class
        Select list = new Select(countryList);
        
        
        System.out.println("is Country listbox accept multiple selection or not: " + list.isMultiple());            //true
        
        Assert.assertTrue(list.isMultiple());
        
        
        System.out.println("====================selection started===============================");
        
        //index start from 0
        list.selectByIndex(0);        //USA
        list.selectByIndex(1);        //Russia
        
        
        Thread.sleep(2000);
        list.selectByValue("India");    //India
        
        
        Thread.sleep(2000);
        list.selectByVisibleText("Spain");//Spain
        
        
        
        System.out.println("====================selection completed===============================");
        
        System.out.println("====================deselection started===============================");
        Thread.sleep(4000);
        list.deselectAll();
        System.out.println("====================deselection completed===============================");
        Thread.sleep(4000);
        
        
        //index start from 0
        list.selectByIndex(0);        //USA
        list.selectByIndex(1);        //Russia
        list.selectByValue("India");    //India
        list.selectByVisibleText("Spain");
        
        
        Thread.sleep(2000);
        
        list.deselectByIndex(1);        
        list.deselectByValue("Spain");
        list.deselectByVisibleText("USA");
        
        
        
    }
    
    
    
    @Test
    public void verifyCarListboxTest() throws Exception {
        
        Thread.sleep(3000);
        //Select ----- to handle listbox/dropdown
                
        WebElement CarList = driver.findElement(By.tagName("select"));              //multiple match ----- first element
            
        //Create an object of Select class
        Select list = new Select(CarList);
        
        
        System.out.println("is Car listbox accept multiple selection or not: " + list.isMultiple());            //false
        
        Assert.assertFalse(list.isMultiple());
        
        
        System.out.println("====================selection started===============================");
        
        Thread.sleep(2000);
        //index start from 0
        list.selectByIndex(1);                  //Saab
        
        
        Thread.sleep(2000);
        list.selectByValue("Singapore");        //Opel
        
        
        Thread.sleep(2000);
        list.selectByVisibleText("Toyota");     //Toyota
        
        
        
        
    }

}