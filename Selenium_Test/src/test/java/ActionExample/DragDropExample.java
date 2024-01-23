package ActionExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class DragDropExample {

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {

        System.out.println("launching app on chrome browser -----using TestNG");
        driver = new ChromeDriver();
        driver.get(Constants.draganddropApp);
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
    public void verifyDragDropTest() {
        
        
        //concept missing ?
        WebElement dragDropFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
        
        driver.switchTo().frame(dragDropFrame);
        
        
        
        
        
        WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'high_tatras3')]"));
        WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'high_tatras4')]"));
        WebElement trash = driver.findElement(By.cssSelector("div#trash"));
        
        
        Actions act = new Actions(driver);
        
        
        //drag and drop
        act.dragAndDrop(img3, trash).perform();
        
        
        
        //A convenience method that performs click-and-hold at the location of the source element, 
        //moves to the location of the target element, then releases the mouse.
        
        
        act.clickAndHold(img4).moveToElement(trash).release().perform();
        
        
    }
}
