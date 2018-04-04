package sai;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class BeforeandAfterclass {

	@Test()
	public void applaunch() {
		System.out.println("applaunch");

	}
 @Test()
 
 public void applogin() {
		System.out.println("applogin");

	}
 @BeforeClass()
 public void BeforeClass() {
		System.out.println("BeforeClass");

	}
 @AfterClass()
 public void Afterclass() {
		System.out.println("Afterclass");

	}
	}


