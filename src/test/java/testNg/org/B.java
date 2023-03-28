package testNg.org;

import org.testng.annotations.Test;

public class B {
	@Test(groups= {"sanity","smoke"})
	private void tc14() {
		System.out.println("TC...14");
		 
	}
	@Test(groups="smoke")
	private void tc15() {
		 System.out.println("Tc...15");
	}
	@Test(groups="sanity")
	private void tc16() {
		System.out.println("Tc..16");
		 
	}
	@Test(groups= {"smoke","sanity"})
	private void tc18() {
		System.out.println("Tc..18");
		 
	}

}
