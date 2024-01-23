package staticExample;

public class AmazonAppTest {

	public static void main(String[] args) {
		
		
		
		//launching a browser
		//launching an application - https://www.amazon.in/
		//enter value "iphone 15" and click on serach button-  Amazon.in : iphone 15
		
		//validation step 
		//application title should be - "Amazon.in : iphone 15"
		
		
		System.out.println("====================validation of application title======================================");
		
		String expectedTitle= "Amazon.in : iphone 15";
		String actualTitle= "Amazon.in : iphone 15";
		
		
		//verify actual and expected are same
		
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			
			System.out.println("validation pass!!");
			
		}
		else {
			
			System.out.println("validation failed!!");
			System.out.println("actual title : " + actualTitle);
		}
		
		
		
		System.out.println("====================validation of application URL======================================");
		
		String expectedURL= "Amazon.in : iphone 15";
		String actualURL= "Amazon.in : iphone 15";
		
		
		//verify actual and expected are same
		
		
		if(expectedURL.equalsIgnoreCase(actualURL)) {
			
			System.out.println("validation pass!!");
			
		}
		else {
			
			System.out.println("validation failed!!");
			System.out.println("actual actualURL : " + actualURL);
		}

	}

}
