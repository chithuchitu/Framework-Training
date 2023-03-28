package junit.org;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

 
public class RunAll {
	@Test
	public void tc () {
		Result r = JUnitCore.runClasses(Greens.class,Data.class);
		
		System.out.println("\n Run Count :" +r.getRunCount());
		System.out.println("\n Ignore Count  : "+r.getIgnoreCount());
		System.out.println("\n Failure Count:"+ r.getFailureCount());
		System.out.println("\n Success Count:"+ r.wasSuccessful() );
		 System.out.println("\n Run Time:"+r.getRunTime());
		 List<Failure> allFail = r.getFailures();
		 System.out.println("\n All  failed Test cases ");
		 for (Failure li : allFail) {
			 System.out.println(li);
			
		}
	}
	 
}
