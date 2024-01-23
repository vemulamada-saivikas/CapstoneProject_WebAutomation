package staticExample;

public class AmazonAppTest2 {

	public static void main(String[] args) {
		
		
		
		//launching a browser
		//launching an application - https://www.amazon.in/
		//enter value "iphone 15" and click on serach button-  Amazon.in : iphone 15
		
		//validation step 
		//application title should be - "Amazon.in : iphone 15"
		
		
		String actualTitleOfApplication = "Amazon.in : iphone 15";
		String actualURLOfApplication = "https://www.amazon.in";
		
		Assert.assertEquals("Amazon.in : iphone 15", actualTitleOfApplication);
		Assert.assertEquals("https://www.amazon.in", actualURLOfApplication);
		
		
		

	}

}
