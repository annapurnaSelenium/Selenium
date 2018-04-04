package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestNgTest 
{
	@Test(priority=1,enabled=false)
	public void appLaunch()
	{
		 System.out.println("App Launch");
		 Assert.fail();
		 
	}
	@Test(priority=2)
	public void appLogin()
	{
		 System.out.println("App Login");
	}
	@Test(priority=3)
	public void appClose()
	{
		 System.out.println("App Close");
	}
}
