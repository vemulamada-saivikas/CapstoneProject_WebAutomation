package Xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xpath extends BaseTest{
    
    
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


