package takeScreenShotExample;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class AmazonApp {
    
    
    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {

        System.out.println("launching app on chrome browser -----using TestNG");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        

    }

    @AfterTest
    public void teardown() throws Exception {

        Thread.sleep(7000);
        driver.close();
        System.out.println("closing an app");

    }
    
    
    
    
    @Test
    public void handleFrame() throws Exception {
        

        //enter search item
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 15 pro");
        
        captureScreenshot("BeforeClick");
        
        
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        
        
        System.out.println("======applicationTitle after serach item==============" + driver.getTitle());
        
        
        //calling a function
        
        captureScreenshot("Amazon_AfterSearchItems");
        
        
    }
    
    
    
    public void captureScreenshot(String fileName) throws Exception {
        
        //Capture a screenshot -----**** a shot -external lib
                File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                
                File targetLocation = new File(".//screenshotFolder//"+fileName+".png"); 
                
                
                FileUtils.copyFile(screenshotFile, targetLocation);
    }

}

    
