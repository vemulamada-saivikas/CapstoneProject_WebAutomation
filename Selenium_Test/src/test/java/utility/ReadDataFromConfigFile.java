package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromConfigFile {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\LeaningAutomationGenpact\\testData\\config.properties");
		
		
		Properties prop = new Properties();
		
		
		
		prop.load(fis);
		
		
		
		
		String pwd = prop.getProperty("password");
		String url = prop.getProperty("appURL");
		
		System.out.println("============fecth value from properties file===============");
		System.out.println("email ID: " + prop.getProperty("email"));
		System.out.println("Password: " + pwd);
		System.out.println("Application URL: " + url);
		

	}

}
