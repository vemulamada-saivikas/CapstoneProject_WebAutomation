package basicTest;

import staticExample.Emp;

public class VariableExample {

	public static void main(String[] args) {
		
		
		String emp_name = "Neeraj";
		int emp_id = 123456;
		String emp_dept = "IT";
		
		
		
		
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Employee ID: " + emp_id);
		System.out.println("Employee Dept: " + emp_dept);
		
		
		
		
		System.out.println("============================================");
		
		Emp emp = new Emp();
		
		String empName = emp.get_empName();
		
		System.out.println("*************" + empName);

	}

}
