package utility;

import unitExample_oops.ReadConfig;

public class NOPCommApp {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("launching a chrome browser");
		System.out.println("launching an application");
		
		
		ReadConfig conf = new ReadConfig();
		
		String appURL = conf.getApplicationURL();
		
		System.out.println("=========url=============:" + appURL);
		System.out.println("==========email============:" + conf.getEmail());
		System.out.println("===========pass===========:" + conf.getPassword());
		
		
		conf.prop.getProperty("");
		
		

	}

}
