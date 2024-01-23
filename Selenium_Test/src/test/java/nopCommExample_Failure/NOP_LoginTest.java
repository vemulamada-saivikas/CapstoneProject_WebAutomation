package nopCommExample_Failure;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class NOP_LoginTest extends BaseTest{
	
	
	
	
	
	@Test
	public void verifyApplicationTitle() {
		
		System.out.println("verifyApplicationTitletest case execution started");
		
		
		String actualAppTitle = driver.getTitle();
		String expectedAppTitle = "Your store. Login";
		
		System.out.println("applicaiton title: " + driver.getTitle());
		
		
		//validation step
		
		Assert.assertEquals(actualAppTitle, expectedAppTitle);
		
	}
	
	
	
	@Test
	public void verifyApplicationURL() {
		
		System.out.println("verifyApplicationURL case execution started");
		
		
		String actualURL = driver.getCurrentUrl();
		String expectedAppURL = "https://admin-demo.nopcommerce.Com/login?ReturnUrl=%2Fadmin%2F";
		
		
		
		if(actualURL.contains("login")) {
			
			System.out.println("=======================================");
			System.out.println(actualURL.contains("login"));
			System.out.println("=======================================");
			System.out.println("===============custom validation========Pass=========");
		}
		
		else {
			
			System.out.println("===============custom validation========failed=========");
		}
		
		
		
		
		
		System.out.println("applicaiton URL: " + actualURL);   //https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		
		
		//validation step
		
		
		
		Assert.assertTrue(actualURL.contains("login!"));
//		Assert.assertEquals(actualURL, expectedAppURL);
		
	}

}
