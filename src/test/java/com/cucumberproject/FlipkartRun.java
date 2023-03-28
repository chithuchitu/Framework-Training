package com.cucumberproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\futurefile\\Flipkart.feature",glue="com.cucumber.flipkartstepdefintion",dryRun=true)
public class FlipkartRun {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launch");

	}
	@AfterClass
	public static void close() {
		driver.close();
		System.out.println("closed");
	}
	 

}
