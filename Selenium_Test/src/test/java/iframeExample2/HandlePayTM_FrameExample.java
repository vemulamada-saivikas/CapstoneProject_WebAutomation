package iframeExample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlePayTM_FrameExample extends BaseTest{
    
    
    @Test
    public void handleFrame() throws Exception {
        
        //nested frame
        
        //switchTo Frame
        //index
        //name or ID
        //WebElement
        
        
        
        WebElement myFrame = driver.findElement(By.xpath("//*[contains(@data-src,'photo')]"));
        
        driver.switchTo().frame(myFrame);
    
        
        //Planning the ascent
        
        String alt_img3 = driver.findElement(By.xpath("//*[contains(@src,'tatras3')]")).getAttribute("alt");
        System.out.println("actual ALT img3: " + alt_img3);

        Assert.assertEquals(alt_img3, "Planning the ascent", "validation of ALT image get failed !! ");
        
        
        
        
    }

}


