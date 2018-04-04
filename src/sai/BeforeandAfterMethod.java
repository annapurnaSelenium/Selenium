package sai;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfterMethod {
 @Test()
	public void applaunch() {
		System.out.println("applaunch");

	}
 @Test()
 
 public void applogin() {
		System.out.println("applogin");

	}
 @BeforeMethod()
 public void BeforeMethod() {
		System.out.println("BeforeMethod");

	}
 @AfterMethod()
 public void AfterMethod() {
		System.out.println("AfterMethod");

	}


}
