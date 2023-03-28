@Login
Feature: Validate login functionality of Facebook Application

@Sanity @Regression
 Scenario: To validate login functionality with invalid Email address and Invalid Password
 
 
#one dimensional  map
     When user enter invalid username and invalid password
     |username  |abc@gmail.com      |    
     |password  |1222222            |
     |username2 | greens@gmail.com  | 
     |password2 |  4547765765       |
     
     
  	 And Click Login button
	   Then The Invalid credential page will show


 @Smoke
 
 Scenario:To validate login functionality with valid Email address and Invalid Password
 
 #two dimensional map
   When user enter invalid username and valid password
   
     |username     |password| userid         | pass     |
	   |greenstech   | 123645 |selenium        | java     | 
	   |data         | Testng |cucumbe         | testing  |
	   |javaselenium | 121454 |greens@gmail.com|122444    |
	   |Cucumber     |selenium| 12212          |455545454 |
	   
   
   And Click Login button
   Then The Invalid credential page will show





 
 