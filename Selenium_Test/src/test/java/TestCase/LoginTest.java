package TestCase;


import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends TestBase{
    
    @Test
    public void verifyLogin() {
        
        
        Assert.assertTrue(lp.verifyEmailTextboxPresent());
        Assert.assertEquals(driver.getTitle(), "Your store. Login");
        
        lp.enterEmail("admin@yourstore.com");
        lp.enterPassword("admin");
        lp.clickRememberMeCheckbox();
        
        lp.clickLoginButton();
        
        
        Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
        
        lp.clickLogoutButton();
        
        
        
        
    }

}

