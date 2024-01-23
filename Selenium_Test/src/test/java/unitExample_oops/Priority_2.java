
package unitExample_oops;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_2 {
    
    
    //execution workflow
    //priority
    //highest negative number is having highest priority  -------- -ve number
    //by default priority is 0 ------------ 0
    //if priority is same ------- execution as per naming conv (as per ascii value)
    
    
    @BeforeTest
    public void launchApp() {
        
        System.out.println("=========launching app=======================");
    }
    
    
    @AfterTest
    public void closeApp() {
        
        System.out.println("=========closing app=======================");
    }
    
    @Test(priority = -100)
    public void login() {
        
        System.out.println("login test case");
    }
    
    @Test(priority = 2)
    public void logout() {
        
        System.out.println("logout test case");
    }
    
    
    @Test
    public void addItems() {
        
        System.out.println("addItems to kart test case");
    }
    
    @Test(priority = 1)
    public void payment() {
        
        System.out.println("payment test case");
    }
    
    @Test(priority = 1)
    public void cancelOrder() {
        
        System.out.println("cancelOrder test case");
    }
    
    
    

}