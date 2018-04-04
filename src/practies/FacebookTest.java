package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vasu");
		
		//driver.findElement(By.xpath("//input[@class='inputtext'][@id='pass']")).sendKeys("selenium");
driver.findElement(By.xpath("//*[normalize-space(text())='Forgotten account?']")).click();
	}

}
