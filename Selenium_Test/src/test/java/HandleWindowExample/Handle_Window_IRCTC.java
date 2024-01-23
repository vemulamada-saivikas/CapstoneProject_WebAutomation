package HandleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handle_Window_IRCTC extends BaseTest{
    
    
    @Test
    public void handleWindowExample() throws Exception {
        
        
        String parentWindow = driver.getWindowHandle();
        System.out.println("===========parentWindow==============" + parentWindow);
        
        
        
        //click on Hotel link
        driver.findElement(By.partialLinkText("HOTEL")).click();
        
        
        
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("=============all window details=============");
        System.out.println("Window Count: " + allWindow.size());
        
        
        
        String win1 = (String)allWindow.toArray()[0];
        String win2 = (String)allWindow.toArray()[1];
        
        System.out.println("===========win1==============" + win1);
        System.out.println("===========win2==============" + win2);
        
//      //diff between close and quite
//      driver.close();
//      driver.quit();
        
        
        
        //alert/iframe/window
        
                
        //switch to Hotel page ------ 
        Thread.sleep(4000);
        
        driver.switchTo().window(win2);
        
        
        
        String win2Title = driver.getTitle();
        System.out.println("=============win2Title===============" + win2Title);
        if(win2Title.contains("Hotels")) {
            
            //click on Login on Hotel Page
            driver.findElement(By.partialLinkText("Login")).click();
            
        }
        
        
        
        
        
        
        
        
        Thread.sleep(4000);
        //switch to Main page ------ 
        
        
        driver.switchTo().window(win1);
        
        
        String win1Title = driver.getTitle();
        System.out.println("=============win1Title===============" + win1Title);
        

//      
//      //click on Contact link
        driver.findElement(By.partialLinkText("CONTACT US")).click();
        
        //switch back to Hotel page again------ 
        Thread.sleep(4000);
        driver.switchTo().window(win2);
        
        //click on login button on Hotel window
        driver.findElement(By.xpath("(//button[text()='Login'])[1]")).click();
        driver.quit();
        
        
        
        
    }

}





