package sample.org;

 import testg.org.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass
{
	public static void main(String[] args) throws AWTException {
        chromeBrowser();
        launchUrl("https://www.facebook.com/");
        maxWindow();
        pageTitle();
        pageUrl();
        WebElement email = driver.findElement(By.id("email"));
        fillTextBox(email, "chithra");
        WebElement pass = driver.findElement(By.name("pass"));
        fillTextBox(pass, "2345");
        WebElement login = driver.findElement(By.name("login"));
        login.click();
   
       
      
       
		  
 
		 
		 
		 
		 
		
		
		
		 
		
		
 
	}

}
