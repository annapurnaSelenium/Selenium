package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest
{
@Test
public void stringCom()
{
	String expTitle="Gmail";
	String actTitle="Gmai";
	
	/*if (expTitle.equals(actTitle)) 
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}*/
	
	//Assert.assertEquals(actTitle, expTitle);
	//Assert.assertEquals(actTitle, expTitle,"Two strings are not equal");
}
}
