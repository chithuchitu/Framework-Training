package testg.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
 
 
		public static void chromeBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
 	}
	 	
	public static String pageTitle() {
	 String title = driver.getTitle();
	 System.out.println(title);
	return title;

	}
	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;

	}
	public  static void launchUrl(String url) {
		driver.get(url);

	}
	public static  void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void btnClick(WebElement element) {
		element.click();
		
	}
	public static void fillTextBox(WebElement ele,String value) {
		
		 ele.sendKeys(value);
	}
	 
				 
	 public static void closeBrowser() {
		driver.close();

	}
	 
	
}
