package sai;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BeforeandAfterTest {
	@Test()
	public void applaunch() {
		System.out.println("applaunch");

	}
 @Test()
 
 public void applogin() {
		System.out.println("applogin");

	}

	@BeforeTest()
	 public void BeforeTest() {
			System.out.println("BeforeTest");

		}
	 @AfterTest()
	 public void AfterTest() {
			System.out.println("AfterTest");

	}

}
