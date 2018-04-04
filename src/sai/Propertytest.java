package sai;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertytest {

	public static void main(String[] args)throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Selenium@4PM\\Selenium\\src\\sai\\prasanna.properties");
		Properties p=new Properties();
		p.load(fis);
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(p.getProperty("url"));
	
	driver.findElement(By.id(p.getProperty("userid"))).sendKeys(p.getProperty("uname"));
		
		
	}

}
