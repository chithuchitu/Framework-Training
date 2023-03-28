package junit.org;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


 
import testg.org.BaseClass;
import testg.org.Loginpojo;
import java.util.Date;

 
public class Sample1 extends BaseClass{
	static WebDriver driver;
	
	 
	@Test
	public  void tc3() {
		Loginpojo l = new Loginpojo();
		WebElement user = l.getTxtEmail();
		fillTextBox(user,"greens@gmail.com");
		String id = user.getAttribute("value");
		Assert.assertEquals("checkemail id", "greens@gmail.com", id);
		WebElement pass = l.getTxtpass();
		fillTextBox(pass, "12345");
		Assert.assertEquals("check password", "12345", pass.getAttribute("value"));
		
		 
	}
	 
	@Test
	public void tc1() {
		
		String  title = pageTitle();
		Assert.assertTrue("check title", title.contains("book"));
		System.out.println(title);
		String url = pageUrl();
		Assert.assertTrue("check url", url.startsWith("https"));
	}	
	@Before
	public void bef() {
		System.out.println("before class..");
		  Date d = new Date();
    	  System.out.println(d);
}
 
	@BeforeClass
	public static  void bef1() {
		 chromeBrowser();
		 launchUrl("https://www.facebook.com/");
		 maxWindow();
	 	}
	@After 
	public void after() {
		System.out.println("after Class...");
		  Date d = new Date();
    	  System.out.println(d);
 	 	}
	@AfterClass
	public  static void aft1() { 
	 closeBrowser();
	}
	
	
	
	

}
 