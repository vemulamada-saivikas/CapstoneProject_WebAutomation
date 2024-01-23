package staticExample;

public class Assert {
	
	
	
	
	
	public static void assertEquals(String exp, String act) {
		
		String expectedTitle= exp;
		String actualTitle= act;
		
		
		//verify actual and expected are same
		
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			
			System.out.println("validation pass!!");
			
		}
		else {
			
			System.out.println("validation failed!!");
			System.out.println("actual title : " + actualTitle);
		}
		
		
		
		
	}
	
	
	
	
	

}
