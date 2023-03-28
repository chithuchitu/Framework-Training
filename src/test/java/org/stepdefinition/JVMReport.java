package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	public static void generateJvmreport(String jsonPath) {
		File f = new File(System.getProperty("user.dir")+ "\\Report\\jvmreport");
		 Configuration c = new Configuration(f, "Facebook APplication");
		 c.addClassifications("platform", "windows");
		 c.addClassifications("jDK Version ", "1.8");
		 c.addClassifications("Selenium Component", "Selenium Webdriver");

		 
		 List<String> li = new ArrayList<String>();
		 li.add(jsonPath);
		 
		 ReportBuilder r = new ReportBuilder(li, c);
		 r.generateReports();
		 
		 

	}

}
