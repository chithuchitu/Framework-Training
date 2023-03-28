package org.pojo;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPass extends BaseClass {
	
//	Non - Parameterized Constructor
	public ForgotPass()
	   {
 	PageFactory.initElements(driver, this);
			
	
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotBtn;
	
	@FindBy(id="identify_email")
	private WebElement emailOrPhone;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchBtn;
	
//	Getter access private WebElement into class

	public WebElement getForgotBtn() {
		return forgotBtn;
	}

	 
	public WebElement getEmailOrPhone() {
		return emailOrPhone;
	}
 

	public WebElement getSearchBtn() {
		return searchBtn;
	}

 

	
	
	
}
