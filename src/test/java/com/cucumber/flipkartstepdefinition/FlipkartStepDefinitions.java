package com.cucumber.flipkartstepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumberproject.FlipkartRun;

import io.cucumber.java.en.*;

public class FlipkartStepDefinitions  {
public static WebDriver driver=  FlipkartRun.driver;

@Given("launch Thwe Chrome Browser and Enter The Url")
public void launch_Thwe_Chrome_Browser_and_Enter_The_Url() {
	driver.get("http://www.flipkart.com");
	
}

@When("user search The Product and Enter Click")
public void user_search_The_Product_and_Enter_Click() {
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("iphones");
	System.out.println("Search Product");
}

@When("takes screenshot for the resulPage")
public void takes_screenshot_for_the_resulPage() throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\Chithra\\src\\test\\java\\Screenshotflipkart.png");
	FileUtils.copyFile(src, f);
	System.out.println("Takes Screenshot");
	
}




 }





