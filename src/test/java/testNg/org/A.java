package testNg.org;

import org.testng.annotations.Test;

public class A {
	@Test(groups="log)")
	private void tc10() {
		 System.out.println("TC....10");

	}
	@Test(groups="log)")
	private void tc22() {
		System.out.println("Tc...22");
		 
	}
	@Test(groups= {"smoke","sanity"})
	private void tc33() {
	 System.out.println("test case 33...");
	}
	@Test(groups="win")
	private void tc11() {
		System.out.println("Test 11");
		
	}
	

}
