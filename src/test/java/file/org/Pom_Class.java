package file.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testg.org.BaseClass;
import testg.org.Loginpojo;

public class Pom_Class extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
//		using pojo class
		Loginpojo l = new Loginpojo();
		
		WebElement a = l.getTxtEmail();
		fillTextBox(a, "greens");
		 Thread.sleep(3000);
		driver.navigate().refresh();
		 fillTextBox(a, "arun");
		
		
		
		
	}
	
	
	
	

}
