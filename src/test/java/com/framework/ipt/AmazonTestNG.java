package com.framework.ipt;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestNG {
	public static WebDriver driver;
	public static void browserLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	}
	public static void search() throws InterruptedException,IOException {
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select DropdownList = new Select(dropdown);
	  java.util.List<WebElement> allSelectedOptions = DropdownList.getOptions();	
		ListIterator<WebElement> listIterator1 = allSelectedOptions.listIterator();
		String Expected = "Music";
		while (listIterator1.hasNext()) {
			WebElement next = listIterator1.next();
			if (Expected.equalsIgnoreCase(next.getText())) {
				DropdownList.selectByVisibleText(Expected);
				System.out.println("Expected Text in Submenu Bar:" + Expected);
				System.out.println("Actual Text in Submenu Bar:" + next.getText());

				break;
			}
		}

		String SearchKeyword = "cd";
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(SearchKeyword);
		Thread.sleep(3000);

		java.util.List<WebElement> Searchsuggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

		for (int i = 1; i <= Searchsuggestions.size(); i++) {

			WebElement EachSearchsuggestions = driver
					.findElement(By.xpath("//div[@class='autocomplete-results-container']//child::div[" + i + "]"));

			if (SearchKeyword.equalsIgnoreCase(EachSearchsuggestions.getText())) {

				System.out.println("Expected Text in Search Bar: " + EachSearchsuggestions.getText());
				System.out.println("Actual Text in Search Bar: " + SearchKeyword);

				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				break;
			}

		}

		WebElement GetTitle1 = driver.findElement(
				By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2"));

		String GetT1 = GetTitle1.getText();

		System.out.println("Produc Name in Product List: " + GetT1);

		driver.findElement(
				By.xpath("//span[(text()='RESULTS')]//ancestor::div[4]//following-sibling::div[1]//child::h2/a"))
				.click();

		String AmazonwindowHandle = driver.getWindowHandle();

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator2 = handle.iterator();

		while (iterator2.hasNext()) {
			String handleID = (String) iterator2.next();

			if (!AmazonwindowHandle.equalsIgnoreCase(handleID)) {

				driver.switchTo().window(handleID);

				WebElement GetElements = driver.findElement(By.xpath("//div[@id='titleSection']/h1"));

				String GetT2 = GetElements.getText();

				System.out.println("Produc Name in unique page: " + GetT2);

				if (GetT2.equalsIgnoreCase(GetT1)) {
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				}
				
				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
				File DestFile = new File("C:\\Users\\Shakthi\\eclipse-workspace\\Amazon\\screenshot\\1.png");
				FileUtils.copyFile(SrcFile, DestFile);
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//a[contains(text(),'Go to Cart')])[2]")).click();
				Thread.sleep(2000);

				java.util.List<WebElement> TitleName = driver
						.findElements(By.xpath("//li[@class='a-spacing-mini']//descendant::a[1]/span/span"));
			
				for (WebElement j2 : TitleName) {
					String GetT4 = j2.getText();
					System.out.println("Product Name in Cart Page: " + GetT4);

					TakesScreenshot scrShot1 = ((TakesScreenshot) driver);

					File SrcFile1 = scrShot1.getScreenshotAs(OutputType.FILE);

					File DestFile1 = new File("C:\\Users\\Shakthi\\eclipse-workspace\\Amazon\\screenshot\\2.png");

					FileUtils.copyFile(SrcFile1, DestFile1);
					driver.close();
					break;

				}
			}

		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();
		search();

	}

}
