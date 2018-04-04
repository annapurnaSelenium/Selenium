package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleRadioTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
	WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
	
List<WebElement>  radio=table.findElements(By.name("group1"));
//System.out.println(radio.size());
for (int i = 0; i < radio.size(); i++) 
{
	System.out.println(radio.get(i).getAttribute("checked")+"----"+radio.get(i).getAttribute("value"));
/*if (radio.get(i).getAttribute("value").equals("Cheese")) 
{
	radio.get(i).click();
}*/
}



	}

}
