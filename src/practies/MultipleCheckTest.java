package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
	WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	
List<WebElement>  check=table.findElements(By.tagName("input"));
System.out.println(check.size());
for (int i = 0; i < check.size(); i++) 
{
	//System.out.println(check.get(i).getAttribute("checked")+"----"+check.get(i).getAttribute("value"));
if (check.get(i).getAttribute("value").equals("Butter")) 
{
	check.get(i).click();
}
}



	}

}
