package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
//	When u have multiple @Before and @After
//	@Before ----Incremental Order
//	@After------Decremental Order
	
	@Before(order=10)
		public void precon1() {
		 chromeBrowser();
		 
		 launchUrl("https://www.facebook.com/");
			 	}
	@Before	(order=20)
	private void precon2() {
		 maxWindow();
		 

	}
	@After(order=5)
	 public void postcon2(Scenario a) { // scenario - Interface
		// If Scenario Failed is Failed()n method wil return true and  execute to allow inside the blaoc then take screenshot
		// If Scenario getting passed  isFailed method wil return false and didnt allow inside the block...
		if (a.isFailed()) {
			
			System.out.println("Take Screenshot...");
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			a.embed(ss, "image/png"); // Image - keyword	
		}

		
		
		
		
	 

	}
	@After(order=1)
	 public void postcon1() {
		 
	 	
	 closeBrowser();
	}

 
}
