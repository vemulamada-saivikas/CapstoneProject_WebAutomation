package basicTest;

import java.util.ArrayList;

public class ArrayList_loopExample {

	public static void main(String[] args) {
		
		
		//create a generic arrayList
		ArrayList<String>  arrTest =   new ArrayList<String>();
		
		
		//how many elements into arrayList
		System.out.println("element count are: " + arrTest.size());
		
		
		
		//add items to arrayList
		arrTest.add("Hulk");			//index ----0
		arrTest.add("Thor");
		arrTest.add("Capt America");
		arrTest.add("Iron Man");
		arrTest.add("Vision");
		

		//how many elements into arrayList --- after addition
		System.out.println("recheck - element count are: " + arrTest.size());
		
		
		
		//list all content from arrayList
		System.out.println("List of all elements: " + arrTest);
		

		
		
		//access value from arrayList using index
		
		System.out.println("superhero on index 3 : " + arrTest.get(3));	                     //"Iron Man"
	
		System.out.println("======================loop example on arrayList===============================");
		
		for (int index = 0; index < arrTest.size(); index++) {
			
			
			System.out.println("superhero are: " + (index+1) + " : " + arrTest.get(index));
			
			
			
		}
		
				
		
		System.out.println("======================loop example on array===============================");
		
		
		int arr[] = {10, 20,30, 40, 50};
		
		for( int ele : arr) {
			
			
			System.out.println("element are: " + ele);
		}
		
		
		System.out.println("======================for each loop example on array===============================");
		
		arrTest.forEach((anything) -> {
			
			System.out.println("element are : " + anything);
			
			
		});
		
		
		
		
	}

}
