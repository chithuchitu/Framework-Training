package testNg.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import testg.org.BaseClass;
import testg.org.Loginpojo;

public class DataProv extends BaseClass{
	@Test(dataProvider="TestData")
	 
		private void tc3(String email,String pass ) throws InterruptedException {
		 
		
			Loginpojo l = new Loginpojo();
			fillTextBox(l.getTxtEmail(),"email");
			fillTextBox(l.getTxtpass(),"pass");
			btnClick(l.getBtnlogin());
			Thread.sleep(3000);

		}
	@Test
	public void tc1() { 
		String url = pageUrl();
		System.out.println(url);

	}

 @Test
	public void tc2() {
		launchUrl("https://www.facebook.com/login/");
		String title = pageTitle();
		System.out.println(title);

	}
 @BeforeMethod
	public void bef() {
		System.out.println("tc...statred..");
	 

	}
 @AfterMethod
	public void aft() {
		System.out.println("tc...end..");

	}
 @BeforeClass
	public void befcls() {
		System.out.println(" statred.....");
		chromeBrowser();

		maxWindow();
	}
 @AfterClass
	public void aftcls() {
		System.out.println("end....");
	     //closeBrowser();

	}
 @DataProvider(name="TestData")
 private Object[][] data(){
	 return new Object[][] {
		 {"Greens","1234"},
			 {"java","1247"},
			 {"selenium","3444"},
			 {"course","5678"}
	 };
			 
	 }
 }
 
 
	 
	 
	 
	 
	


