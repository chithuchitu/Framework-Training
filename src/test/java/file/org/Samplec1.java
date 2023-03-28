package file.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testg.org.BaseClass;
import testg.org.Loginpojo;

public class Samplec1 extends BaseClass{
	public Samplec1() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(name="pass")
	private WebElement txtpass;
//	OR Operator
	@FindAll({
			
		@FindBy(xpath="//button[@type='submit']"),//T
		@FindBy(xpath="//button[@name='login']")// T
		
	})
	
	private WebElement btnlogin;
		public WebElement getTxtEmail() {
		return txtEmail;
	}
	 public WebElement  getTxtpass() {
		 return txtpass;
		 
	 }
}
	
	
	 
	