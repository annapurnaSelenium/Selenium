package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibraryFile

{
	public FirefoxDriver driver;
	public String res;
	
//appLaunch
	public String applaunch(String url)
	{
	    driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if (driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String applogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("welcome")).isDisplayed()) 
		{
			res="pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	public static void main(String[] args)
	{
		LibraryFile v=new LibraryFile();
	//	v.applaunch();
		System.out.println(v.applaunch("http://opensource.demo.orangehrmlive.com"));
System.out.println(v.applogin("Admin", "admin"));
	}

}
