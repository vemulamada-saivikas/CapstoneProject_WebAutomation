package testNG_annotationExample;

import org.testng.annotations.Test;

public class NOP_LoginTest extends BaseTest{
    
    
    
    
    
    @Test(priority = -1)
    public void verifyLoginFeature() {
        
        System.out.println("login test case execution started");
        
    }

    @Test
    public void verifyLogoutFeature() {
        
        System.out.println("verifyLogoutFeature test case execution started");
        
    }
    
    
    @Test
    public void verifyAppTitleFeature() {
        
        System.out.println("verifyAppTitleFeature test case execution started");
        
    }
    
    @Test
    public void verifyAddCustFeature() {
        
        System.out.println("verifyAddCustFeature test case execution started");
        
    }
}