package unitExample_oops;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_PriorityExample {
    
    
    //execution workflow
    //priority
    
    
    
    @BeforeTest
    public void launchApp() {
        
        System.out.println("=========launching app=======================");
    }
    
    
    @AfterTest
    public void closeApp() {
        
        System.out.println("=========closing app=======================");
    }
    
    @Test
    public void login() {
        
        System.out.println("login test case");
    }
    
    @Test
    public void logout() {
        
        System.out.println("logout test case");
    }
    
    
    @Test
    public void addItems() {
        
        System.out.println("addItems to kart test case");
    }
    
    @Test
    public void payment() {
        
        System.out.println("payment test case");
    }
    
    @Test
    public void cancelOrder() {
        
        System.out.println("cancelOrder test case");
    }
    
    
    

}