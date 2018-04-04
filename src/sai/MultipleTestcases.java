package sai;

import org.testng.annotations.Test;

public class MultipleTestcases {
@Test(priority=1)
	public void applaunch(){
		
System.out.println("applaunch");
	}

@Test(priority=2)
public void applogin(){
	
System.out.println("applogin");
	}
@Test(priority=3)
public void appclose(){
	
System.out.println("appclose");
	}

}

