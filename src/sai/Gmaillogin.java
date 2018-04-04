package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmaillogin {

	public static FirefoxDriver driver;
	@BeforeTest
	public void applaunch()throws Exception
{
		
driver=new FirefoxDriver();
driver.get("https://www.google.com/gmail/");
driver.manage().window().maximize();
}
	
@Test
public void applogin() throws Exception
{

driver.findElement(By.id("identifierId")).sendKeys("saiprasanna.930@gmail.com");
driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(".//*[@id='password']/div[1]")).sendKeys("saii_930");

driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

}
@AfterTest
public void appclose()
{
	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
}
}