package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1
{
	@Test
	public void method1()
	{
		System.out.println("Method1");
	}
	@Test
	public void method2()
	{
		System.out.println("Method2");
	}

	@BeforeTest
	public void before()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void after()
	{
		System.out.println("AfterTest");
	}
}
