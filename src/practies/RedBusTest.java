package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.Redbus.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		Thread.sleep(2000);
		
List<WebElement>   cities=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
System.out.println(cities.size());
for(WebElement element:cities)
{
	//System.out.println(element.getText());
	if (element.getText().equals("Hospet")) 
	{
		element.click();
		break;
	}
}
	}

}
