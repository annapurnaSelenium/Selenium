package practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticWebTableTest {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//rows count
		
	List<WebElement>  rows=	driver.findElements(By.xpath(".//*[@id='customers']/tbody/tr"));
	
	//System.out.println(rows.size());
	
	for (int i = 0; i < rows.size(); i++) 
	{
		//coloumn count
	List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
	//System.out.println(col.size());
	
	for (int j = 0; j < col.size(); j++)
	{
		//System.out.println(col.get(j).getText());
		if (col.get(j).getText().equals("UK"))
		{
			System.out.println(col.get(j).getText());
			break;
		}
		
	}
	}
	
	//System.out.println(driver.findElement(By.xpath(".//*[@id='customers']/tbody/tr[6]/td[3]")).getText());
		
	}

}
