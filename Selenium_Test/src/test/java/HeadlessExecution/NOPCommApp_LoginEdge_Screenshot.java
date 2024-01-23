package HeadlessExecution;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class NOPCommApp_LoginEdge_Screenshot {

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {

        System.out.println("launching app on chrome browser -----using TestNG");

        // headless mode

        //EdgeOptions option = new EdgeOptions();
        //option.addArguments("--headless");

       // driver = new EdgeDriver(option);
        
     // headless mode

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");

        driver = new ChromeDriver(option);

        // without headless
//              driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
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
    public void loginFeature() throws Exception {

        driver.findElement(By.cssSelector("input#Email")).clear();
        driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");

        driver.findElement(By.cssSelector("input#Password")).clear();
        driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");

        driver.findElement(By.cssSelector("input#RememberMe")).click();

        driver.findElement(By.tagName("button")).click();

        System.out.println("Application title after login: " + driver.getTitle());

        driver.findElement(By.partialLinkText("Logout")).click();

        System.out.println("Application title after logout: " + driver.getTitle()); // Your store. Login

//      Assert.assertTrue(driver.getTitle().contains("google"));
        
        captureScreenshot("nop_comm_app_login_logout");

    }

    public void captureScreenshot(String fileName) throws Exception {

        // captuare a screenshot -----**** ashot -external libe

//      TakesScreenshot ts = (TakesScreenshot)driver;

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File targetLocation = new File(".//screenshotFolder//" + fileName + ".png");

        FileUtils.copyFile(screenshotFile, targetLocation);
    }

}

