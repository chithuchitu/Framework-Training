package org.stepdefinition;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.ForgotPass;
import org.pojo.LoginPojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends  BaseClass{
	 
	 LoginPojo l;
	 ForgotPass f ;
	 	 @Given("Enter facebook url in Chrome Browser")
	 public void enter_facebook_url_in_Chrome_Browser() {
         chromeBrowser();
	     launchUrl("https://www.facebook.com/");
	     pageTitle();
	    
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     	 } 
	 	@Given("launch the browser and url")
	 	public void launch_the_browser_and_url() {
	 		chromeBrowser();
	 		System.out.println("Forgot password page");
		     launchUrl("https://www.facebook.com/");
		     
		     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 	    	 	}

	 	@When("user click forgotten password buttton")
	 	public void user_click_forgotten_password_buttton() {
	 		  f = new ForgotPass();
	 		 btnClick(f.getForgotBtn());
	 	    	 	}

	 	@When("user have to enter email or mobiloe no")
	 	public void user_have_to_enter_email_or_mobiloe_no() {
	 	   WebElement emailOrPhone = f.getEmailOrPhone();
	 	   fillTextBox(emailOrPhone, "9080561438");
	 	}

	 	@When("then click the search button")
	 	public void then_click_the_search_button() {
	 		WebElement searchBtn = f.getSearchBtn();
	 		btnClick(searchBtn);
	 		      
	 	}

//	 	 Scenario 1
	 	@When("user enter invalid username and invalid password")
	 	public void user_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
//	 		One Dimensional List
	 		System.out.println("Scenario 1: One Dimensional  Map");
	 	 Map<String, String> m = d.asMap(String.class, String.class);
//	 		Get the Particular data
	 		String email =m.get("username");//abc@gmail.com 
	 	 		
	 		l =new LoginPojo();
	 		
	 		WebElement username = l.getTxtEmail();
	 		fillTextBox(username,email);
	 		
	 		fillTextBox(l.getTxtpass(),m.get("password2"));// 4547765765 
	 		
	     	 	}
//	 	 Scenario 2
	 	@When("user enter invalid username and valid password")
	 	public void user_enter_invalid_username_and_valid_password(DataTable d) {
	 		System.out.println("Scenario 2:  Two Dimensional map " );
	 		
	 		  List<Map<String, String>> li = d.asMaps(String.class,String.class);
	 		  //Get row(particular map|)
	 		  Map<String, String> m = li.get(2);
	 		  // get  value by passing key
	 		  String email = m.get("username");
	 		  
	 		     l =new LoginPojo();
	 		     WebElement username  = l.getTxtEmail();
	 		     fillTextBox(username, email);
	 		     fillTextBox(l.getTxtpass(),li.get(2).get("pass"));
	 	}

 	       @When("user enter value in{string} and {string}")
     public void user_enter_value_in_and(String username, String password) {
	l = new LoginPojo();
	WebElement email = l.getTxtEmail();
	fillTextBox(email,username );
	fillTextBox(l.getTxtpass(), password);
	 }
	 	 @When("Click Login button")
	 public void click_Login_button() throws InterruptedException {
		  WebElement btnlogin = l.getBtnlogin();
		 btnClick(btnlogin);
		 Thread.sleep(2000);
	    	 }
	 @Given("Maximize the window")
	 public void maximize_the_window() {
		 maxWindow();
	 }
	 @Then("close browser")
	 public void close_browser() {
	     closeBrowser();
	 }

 	 @Then("The Invalid credential page will show")
 	 public void the_Invalid_credential_page_will_show() {
 		 System.out.println("User is in Invalid Credential Page");
  
 	 }
	 
	 


}
