package com.framework.ipt;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class FlipkartTestNg {

	public static WebDriver driver;


	@BeforeTest
	public void browserLaunch() {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test( priority=1)
	public static void getUrl() {
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println("Browser Launch");
	}
	@Test(dependsOnMethods="flipkart.Flipkart.getUrl")
	public static void searchProductPage() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphones");
		System.out.println("Search Product");

	}
	@Test(dependsOnMethods="searchProductPage")
	@Ignore
	public static void screenshotProductPage() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\KEERTHI\\eclipse-workspace\\IP_1\\Screenshot\\flipkart.png");
		FileUtils.copyFile(src, f);
		System.out.println("Takes Screenshot");
	}
	@Test(dependsOnMethods="searchProductPage")
	private void productPrice() {

		List<WebElement> allPrice = driver.findElements(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']//following::div[@class='_30jeq3 _1_WHN1']"));
		for (WebElement price : allPrice) {
			String text = price.getText();
			System.out.println(text);
		}
	}
	@AfterTest
	public static void close() {
		driver.close();
		System.out.println("closed");
	}
}


