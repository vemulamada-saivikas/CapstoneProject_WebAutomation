package exercise;

import unitExample_oops.ReadConfig;

public class NOPCommApp {
	
	public ReadConfig conf;

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("launching a chrome browser");
		System.out.println("launching an application");
		
		
		ReadConfig conf = new ReadConfig();
		
		String appURL = conf.getApplicationURL();
		
		System.out.println("======================:" + appURL);
		System.out.println(conf.getEmail());
		
		
		

	}
	
	
	
	
	public void getDetails() {
		
		System.out.println(conf.getEmail());
	}

}
