package basicTest;

public class LoopExample {

	public static void main(String[] args) {
		
//		int x = 20;
		
		System.out.println("==============for loop example=================");
		
		for (int i = 0; i <= 9; i++) {
			
			
			System.out.println("line of code : " + i);
			
		}
		
		
		System.out.println("==============while loop example=================");
		
		int i = 5;
		
		while(i > 1) {
			
			
			System.out.println("value of: " + i);
			i--;    
			
		}
		
		
		
		System.out.println("==============do-while loop example=================");
		
		
		int x = 20;
		
		do {
			
			System.out.println("value of x: " + x);
			x ++;
		}
		
		while(x < 20);
		
		

	}

}
