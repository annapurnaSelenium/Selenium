package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertTest 
{
	@Test(priority=1)
	public void appLaunch()
	{
		SoftAssert s=new SoftAssert();
		 System.out.println("App Launch Started");
		 s.assertEquals(12, 13);
		 System.out.println("App Launch Completed");
		 s.assertAll();
			 
	}
	@Test(priority=2)
	public void appLogin()
	{
		System.out.println("App Login Started");
		 Assert.assertEquals(13, 13);
		 System.out.println("App Login Completed");
	}
}
