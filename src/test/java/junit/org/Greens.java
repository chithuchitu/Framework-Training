package junit.org;

import org.junit.Assert;
import org.junit.Test;

public class Greens {
	@Test
	public void tc31() {
		Assert.assertTrue(false);
		 System.out.println("tc 31....");

	}
	@Test
	public void tc11() {
		Assert.assertTrue("check tc11 ..", true);
		System.out.println("tc ...11");
		 
	}
	@Test
	public  void tc21() {
		 Assert.assertTrue("check tc 21 again...",false);
		 System.out.println("tc....21");

	}

}
