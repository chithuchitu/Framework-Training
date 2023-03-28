package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	} 
// using @findBy's
	
		@CacheLookup
		@FindBys({ 
			
		@FindBy(id="email"),
		@FindBy(xpath="//input[@name='email']")
		 		
		})
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
