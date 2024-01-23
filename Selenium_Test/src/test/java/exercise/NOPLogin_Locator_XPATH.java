package exercise;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NOPLogin_Locator_XPATH {
    
	
	WebDriver driver;

    @BeforeTest
    public void setup() {

        System.out.println("launching app on chrome browser -----using TestNG");
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown() throws Exception {

        Thread.sleep(5000);
        driver.close();
        System.out.println("closing an app");

    }
    
    @Test
    public void verifyLogin() throws Exception {
        
        Thread.sleep(3000);
        
        WebElement txt_email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
//      driver.findElement(By.xpath("//input[@id='Email']"));
        
        
        
        //validate the attribute property value
        String email_att = txt_email.getAttribute("data-val-required");
        
        System.out.println("Attribute value: " + email_att);
        Assert.assertTrue(email_att.contains("Please enter"));
        
        
        
        
        txt_email.clear();
        txt_email.sendKeys("admin@yourstore.com");
        
        
        driver.findElement(By.xpath("//*[@class='password']")).clear();
        driver.findElement(By.xpath("//*[@class='password']")).sendKeys("admin");
        
        
        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        
        
        
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        
        String btn_login_text = btnLogin.getText();
        System.out.println("login button text value are: " + btn_login_text);


        btnLogin.click();
        Thread.sleep(3000);
        
        
        System.out.println("application title after login: " + driver.getTitle());              //Dashboard / nopCommerce administration
        Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
        
        
        
        
//      driver.findElement(By.linkText("Logout"));
//      driver.findElement(By.partialLinkText("Logo"));
        
        
//      driver.findElement(By.xpath("//a[contains(text(),'Logo')]")).click();
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        
        Thread.sleep(3000);
        System.out.println("application title after logout: " + driver.getTitle());                 //Dashboard / nopCommerce administration
        Assert.assertEquals(driver.getTitle(), "Your store. Login");
        
        
    }

}