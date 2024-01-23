package LaunchingApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;

public class saucedemo {
    
    @SuppressWarnings("deprecation")
    @Test
    public void setup() throws Throwable {
        
        //Choosing Chrome Driver
        
        WebDriver driver=new ChromeDriver();
        
        //Opening an application
        
        driver.get("https://www.saucedemo.com/");
        
        driver.manage().window().fullscreen();
        
        
        Thread.sleep(2000);
        //Passing username and password

        driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
        
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
        
        //Performing Login Operation
        
        driver.findElement(By.id("login-button")).click();
        
        //Url Validation and Title Validation
        
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        
        Assert.assertEquals(url,"https://www.saucedemo.com/inventory.html");
        
        Assert.assertEquals(title,"Swag Labs");
        
        System.out.println(url);
        
        Thread.sleep(2000);
        //Selecting Backpack
        
        driver.findElement(By.cssSelector("[id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        
        
        
        Thread.sleep(2000);
        
        //Opening Cart
        
        driver.findElement(By.cssSelector("[id='shopping_cart_container']")).click();
        

        
        //Checkout 
        
        driver.findElement(By.cssSelector("[id='checkout']")).click();
        
        //Entering address\
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("[id='first-name']")).sendKeys("Vikass");
        
        driver.findElement(By.cssSelector("[id='last-name']")).sendKeys("Vikasa");
        
        driver.findElement(By.cssSelector("[id='postal-code']")).sendKeys("112233");
        
        
                
        driver.findElement(By.cssSelector("[id='continue']")).click();
                
        
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("[id='finish']")).click();
        
        
        
        //Validating #finish
        
        String text=driver.findElement(By.cssSelector("h2[class=\"complete-header\"]")).getText();
        
        Assert.assertEquals(text, "Thank you for your order!");
         
        
        Thread.sleep(2000);

        System.out.println(text);
        
        driver.close();
        
        
        
        
        
        
        
        
        
    }

}
