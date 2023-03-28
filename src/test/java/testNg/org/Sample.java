package testNg.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testg.org.BaseClass;
import testg.org.Loginpojo;

public class Sample extends BaseClass{
	
	@Test
	public void tc1() {
		System.out.println("tc...1...");
		String url = pageUrl();
		System.out.println(url);

	}
@Parameters({"Username","Password"})
 @Test
	private void tc3(@Optional("selenium") String email,@Optional("1245") String pass) {
		System.out.println("tc...3...");
		System.out.println();
		Loginpojo l = new Loginpojo();
		fillTextBox(l.getTxtEmail(),"Greens");
		fillTextBox(l.getTxtpass(),"1234");
		btnClick(l.getBtnlogin());

	}
 @Test
	public void tc2() {
		System.out.println("tc...2...");
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
		launchUrl("https://www.facebook.com/login/");
		maxWindow();
	}
 @AfterClass
	public void aftcls() {
		System.out.println("end....");
	     closeBrowser();

	}
 
	 
	 
	 
	 
	 

	
}
