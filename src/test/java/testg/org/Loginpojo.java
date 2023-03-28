package testg.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo  extends BaseClass{
	public Loginpojo() {
		PageFactory.initElements(driver, this);
	} 
// using @findBy's
		
		@FindBy(id="email")
		private WebElement txtEmail;
		
		@FindBy(name="pass")
		private WebElement txtpass;
		
		@FindBy(name="login")
		private WebElement btnlogin;
		
		public WebElement getTxtEmail() {
			return txtEmail;
		}
		 public WebElement  getTxtpass() {
			 return txtpass;
			 
		 }
		 public WebElement getBtnlogin() {
			return btnlogin;
			 
		 }
		
		
		
		
		
		
		
		
		
 

}
