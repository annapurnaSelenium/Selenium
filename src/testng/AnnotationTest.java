package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest
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

@BeforeMethod
public void before()
{
	System.out.println("BeforeMethod");
}
@AfterMethod
public void after()
{
	System.out.println("AfterMethod");
}
@BeforeClass
public void beforeC()
{
	System.out.println("BeforeClass");
}
@AfterClass
public void afterC()
{
	System.out.println("AfterClass");
}

}
