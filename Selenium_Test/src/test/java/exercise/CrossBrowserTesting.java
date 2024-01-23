package exercise;

import org.junit.Test;

public class CrossBrowserTesting {
	
	
	
	@Test
	public void verifyLoginFeature() {
		
		
		
		String browserDetails = "chrome";
		
		
		if(browserDetails.equalsIgnoreCase("CHROME")) {
			
			System.out.println("launching chrome browser");
			System.out.println("launching an application on chrome browser");
		}
		
		else if(browserDetails.equalsIgnoreCase("edge")) {
			
			System.out.println("launching edge browser");
			System.out.println("launching an application on edge browser");
		}
		
		else if(browserDetails.equalsIgnoreCase("firefox")) {
			
			System.out.println("launching firefox browser");
			System.out.println("launching an application on firefox browser");
		}
		
		
		else {
			
			System.out.println("launching default browser, CHROME");
		}
		
		
		
		//======================================================================================//
		
		
		
		
		
		
		
		System.out.println("login tets case executed......");
		
	}
	
	

}
