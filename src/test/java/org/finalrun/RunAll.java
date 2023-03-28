package org.finalrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\forgotfunction.feature",glue="org.stepdefinition"
,dryRun=false,strict = true,monochrome=true,

plugin = {"pretty",
		"html:C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\Report\\htmlreport",
		"junit:C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\Report\\junitreport\\juni.xml",
		"json:C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\Report\\jsonreport\\fb.json",
		"rerun:C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\Rerun\\fb.txt"
 })
		
                                                                              

public class RunAll {
	@AfterClass
	public static void report() {
		 JVMReport.generateJvmreport(System.getProperty("user.dir")+"\\Report\\jsonreport\\fb.json");
		 

	}
	
	


}
