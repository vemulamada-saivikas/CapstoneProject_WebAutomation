package basicTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		//HashMap is dynamic form of Map whereas Map is static type of Map.
		
		
		Map<String, String> objMap = new HashMap<String, String>();
		
		
		
		objMap.put("emp_Name", "Sanjeev");
		objMap.put("org", "StripData");
		objMap.put("age", "31");
		objMap.put("dept", "Training");
		objMap.put("role", "manager");
		
		
		
		System.out.println("=============elements of the map===========");
		System.out.println(objMap);
		
		
		
		
		
		System.out.println("========================another example============================");
		
		HashMap<Integer, String>    objMap1 = new HashMap<Integer, String>();
		
		objMap1.put(1, "JIRA Agile");
		objMap1.put(2, "Database Testing");
		objMap1.put(3, "Selenium Automation");
		objMap1.put(4, "Playwright");
		objMap1.put(5, "Cypress");
		objMap1.put(6, "MObile Auotmation");
		objMap1.put(7, "extra topics");
		objMap1.put(8, "extra topics2");
		
		
		System.out.println("=============elements of the another HashMap===========");
		System.out.println(objMap1);
		
		
		//remove an element from HashMap
		String removedItem = objMap1.remove(7);
		
		System.out.println("=============elements of HashMap after remove===========");
		System.out.println("removed item from HashMap: " + removedItem);
		System.out.println(objMap1);
		
		
		

	}

}
