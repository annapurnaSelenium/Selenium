package sai;

import org.testng.annotations.Test;

public class EnableAttribute {

	@Test(enabled=false)
	public void applaunch()
	{
		System.out.println("applaunch");
		
	}
	@Test
	public void applogin()
	{
		System.out.println("applogin");
		
	}
	@Test
	
	public void appclose()
	{
		System.out.println("appclose");
		
	}

	}


