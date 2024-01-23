package testNG_annotationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//TestNG ------ execution workflow

//precondition ----- BeforeSuite, BeforeTest, BeforeClass, BeforeMethod
//TestCase ---- @Test
//post-condition ------AfterSuite, AfterTest, AfterClass, AfterMethod



public class BaseTest {
    
    
    
    @BeforeSuite
    public void BeforeSuite1() {
        
        System.out.println("**********************BeforeSuite**********************");
        
        
    }
    
    @AfterSuite
    public void AfterSuite1() throws Exception {
        
        System.out.println("**********************AfterSuite**********************");
        
        
    }
    
    
    
    @BeforeClass
    public void beforeClassExample() {
        
        System.out.println("===============BeforeClass================");
        
        
    }
    
    @AfterClass
    public void afterClassExample() throws Exception {
        
        System.out.println("===============AfterClass================");
        
        
    }
    
    
    @BeforeMethod
    public void beforeMethodExample() {
        
        System.out.println("===============execute before each method execution============================");
        
        
    }
    
    @AfterMethod
    public void afterMethodExample() throws Exception {
        
        System.out.println("===============execute after each method execution============================");
        
        
    }
    
    @BeforeTest
    public void setup() {
        
        System.out.println("===============BeforeTest================");
        
        
    }
    
    @AfterTest
    public void teardown() throws Exception {
        
        System.out.println("===============AfterTest================");
        
        
    }


    
}
