package basicTest;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		
		//create a generic arrayList
		ArrayList<Object>  arrTest =   new ArrayList<Object>();
		
		
		//how many elements into arrayList
		System.out.println("element count are: " + arrTest.size());
		
		
		
		//add items to arrayList
		arrTest.add("Hulk");			//index ----0
		arrTest.add("Thor");
		arrTest.add("Capt America");
		arrTest.add("Iron Man");
		arrTest.add("Vision");
		arrTest.add(12123);

		//how many elements into arrayList --- after addition
		System.out.println("recheck - element count are: " + arrTest.size());
		
		
		
		//list all content from arrayList
		System.out.println("List of all elements: " + arrTest);
		
//		System.out.println("element on 2nd index are: " );
		
		
		System.out.println("====================remove elements from arrayList================================");
		
		//Remove elements by using index
		arrTest.remove(2);
		
		//Remove elements by using index
		arrTest.remove("Iron Man");
		
		//list all content from arrayList
		System.out.println("reprint after removing element from list ----> List of all elements: " + arrTest);
		
		
		
		
		//how many elements into arrayList --- after addition
		System.out.println("recheck - element count are after removing elements from list: " + arrTest.size());
		
		
		
		//check if the list contains "Vision"
		
		System.out.println("verify Vision into arrayList: " + arrTest.contains("Vision"));
		
				
		
		
		
		
	}

}
