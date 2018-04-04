package sai;

import org.testng.annotations.Test;

public class DependsonMehod {
	@Test()
	public void applaunch()
	{
		System.out.println("applaunch");
		
	}
	@Test(dependsOnMethods="applaunch")
	
	public void applogin()
	{
		System.out.println("applogin");
		
	}
	@Test(dependsOnMethods ="applogin")
	
	public void appclose()
	{
		System.out.println("appclose");
		
	}
	
}
