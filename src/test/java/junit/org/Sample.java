package junit.org;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	static WebDriver driver;
	@Test
	public void tc3() {
		System.out.println("Test case 3...");
		driver.findElement(By.id("email")).sendKeys("Chithra");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		System.out.println("Test case  executed successfully...");
  
	}
	@Test
	public void tc1() {
		System.out.println("Test case 1...");
		 String c = driver.getCurrentUrl();
		 System.out.println(c);
	}
	 
	@Test
	public void tc2() {
		System.out.println("Test case 2...");
        String t = driver.getTitle();
        System.out.println(t);
	}
	@Before
	public void bef() {
		System.out.println("Before Test case ...");
		 
	 Date d = new Date();
	 System.out.println(d);
	}
	@BeforeClass
	public static void bef1() {
		System.out.println("Test case Started...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	  
	}
	@After
	public  void aft() {
		System.out.println("After Test Case ..");
    	  Date d = new Date();
    	  System.out.println(d);
}
	@AfterClass
	public static void aft1() {
		System.out.println("Test case Ended...");
 
    driver.close();
}
}
