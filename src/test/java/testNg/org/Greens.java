package testNg.org;

import org.testng.annotations.Test;

@Test(priority=2)
public class Greens {
	public void tc1() {
		System.out.println("Test 1");
		
	}
	@Test(priority=-1)
	public void tc4() {
		System.out.println("Test 4");
		
	}
	
	@Test(priority=13)
		public void tc3() {
		System.out.println("Test 3");
		
	}
	@Test(priority=-3)
	public void tc2() {
		System.out.println("Test 2");
		
	}
	@Test(priority=5)
	public void tc5() {
		System.out.println("Test 5");
			}
}
	