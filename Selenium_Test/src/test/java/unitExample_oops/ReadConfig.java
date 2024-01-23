package unitExample_oops;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public Properties prop;

	public ReadConfig() throws Exception {

		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");

		prop = new Properties();

		prop.load(fis);

//		System.out.println("application url: " + prop.getProperty("appURL"));

	}

	public String getApplicationURL() {

		return prop.getProperty("appURL");

	}

	public String getEmail() {

		return prop.getProperty("email");

	}

	public String getPassword() {

		return prop.getProperty("password");

	}
	
	public String getBrowser() {

		return prop.getProperty("browser");

	}

}
