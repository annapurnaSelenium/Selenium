package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='div-close']")).click();
		
		driver.findElement(By.id("loginsubmit")).click();

	}

}
