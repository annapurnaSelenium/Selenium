package practies;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
	String homePage=driver.getWindowHandle();
	//System.out.println(homePage);
	driver.findElement(By.id("loginsubmit")).click();
	Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();
	
	while(it.hasNext())
	{
		String curentWindowId=it.next().toString();
		if (!homePage.equals(curentWindowId))
		{
			driver.switchTo().window(curentWindowId);
			driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		}
	}
	
	

	}

}
