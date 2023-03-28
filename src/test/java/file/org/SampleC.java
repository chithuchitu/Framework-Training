package file.org;

import org.openqa.selenium.WebElement;

import testg.org.BaseClass;
import testg.org.Loginpojo;

public class SampleC extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		Loginpojo l = new Loginpojo();
		
		WebElement a = l.getTxtEmail();
		fillTextBox(a, "greens");
		WebElement b = l.getTxtpass();
		fillTextBox(b,"12345");
		btnClick(l.getBtnlogin());
	
	
	}
	
	

}
