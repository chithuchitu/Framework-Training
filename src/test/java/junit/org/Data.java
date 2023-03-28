package junit.org;

import org.junit.Assert;
import org.junit.Test;

public class Data {
	@Test
	public void tc3() {
		Assert.assertTrue(false);
		 System.out.println("check tc 3 again....");

	}
	@Test
	public void tc1() {
		Assert.assertTrue("check tc1 again..", false);
		System.out.println("tc ...1");
		 
	}
	@Test
	public  void tc2() {
		 Assert.assertTrue("check tc 2...", true);
		 System.out.println("tc....2");

	}
	 

}
