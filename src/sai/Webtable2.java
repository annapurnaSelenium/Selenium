package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable2 {

	public static void main(String[] args)throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[6]/td[5]")).getText());

	}

}
