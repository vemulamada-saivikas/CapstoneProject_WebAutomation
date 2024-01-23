package unitExample;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class AmazonTestExample {
	
	
	//unit testing framework
	//Junit
	//annotation
	
	
	
	
	@Test
	public void verifyApplicationTile() {
		
		
		System.out.println("verifyApplicationTile.......");
		
		
		Assert.assertEquals("iphone 15", "iphone 15 pro");
		
		
	}

}
