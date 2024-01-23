package webAppExample;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import unitExample_oops.ReadConfig;

public class CrossBrowserTesting {
	
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		ReadConfig conf = new ReadConfig();
		
		String browserDetails = conf.getBrowser();
		
		
		System.out.println("fetch the value from config file: " + conf.getBrowser());
		
		if(browserDetails.equalsIgnoreCase("CHROME")) {
			
			System.out.println("launching chrome browser");
			System.out.println("launching an application on chrome browser");
			new ChromeDriver();
		}
		
		else if(browserDetails.equalsIgnoreCase("edge")) {
			
			System.out.println("launching edge browser");
			System.out.println("launching an application on edge browser");
			new EdgeDriver();
		}
		
		else if(browserDetails.equalsIgnoreCase("firefox")) {
			
			System.out.println("launching firefox browser");
			System.out.println("launching an application on firefox browser");
			new FirefoxDriver();
		}
		
		
		else {
			
			System.out.println("launching default browser, CHROME");
			new ChromeDriver();
		}
		
		
		
		//======================================================================================//
		
		
		
		
		
		
		
		System.out.println("login tets case executed......");
		
	}
	
	

}
