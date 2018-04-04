package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicxpath {

	public static void main(String[] args) throws Exception
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		Thread.sleep(2000);
		
	List<WebElement> links=driver.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_1519')]/span"));
		
System.out.println(links.size());

links.get(2).click();
	}

}
