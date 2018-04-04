package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLinkTest
{

	public static void main(String[] args)
	{
	//String expTitle="Gmail";	
FirefoxDriver driver=new FirefoxDriver();
driver.get("Http://Google.co.in");
driver.manage().window().maximize();
//clicking on Gmail
//driver.findElement(By.className("gb_P")).click();
driver.findElement(By.linkText("Gmail")).click();
//String actTitle=driver.getTitle();
if (driver.findElement(By.id("identifierId")).isDisplayed())
{
	System.out.println("Links is working correctly");
}else
{
	System.out.println("Links is Not working correctly");
}


	}

}
